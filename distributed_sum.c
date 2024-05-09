#include <stdio.h>
#include <omp.h>

#define ARRAY_SIZE 1000

int main() {
    int array[ARRAY_SIZE];
    int partial_sums[omp_get_max_threads()];
    int sum = 0;

    // Initialize array with values
    for (int i = 0; i < ARRAY_SIZE; i++) {
        array[i] = i + 1;
    }

    // Parallel loop to calculate partial sums
    #pragma omp parallel
    {
        int thread_id = omp_get_thread_num();
        partial_sums[thread_id] = 0;

        #pragma omp for
        for (int i = thread_id * (ARRAY_SIZE / omp_get_num_threads()); i < (thread_id + 1) * (ARRAY_SIZE / omp_get_num_threads()); i++) {
            partial_sums[thread_id] += array[i];
        }
    }

    // Combine partial sums to calculate total sum
    for (int i = 0; i < omp_get_max_threads(); i++) {
        sum += partial_sums[i];
        printf("Thread %d partial sum: %d\n", i, partial_sums[i]);
    }

    // Display the total sum
    printf("Total sum: %d\n", sum);

    return 0;
}
