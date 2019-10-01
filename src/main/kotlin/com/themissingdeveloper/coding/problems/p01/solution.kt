package com.themissingdeveloper.coding.problems.p01

/**
 * This proposed solution works as follows:
 *
 * It iterates over the list of values and calculates the complement of each value to sum
 * to the target, then it checks for the complement in a lookup table. If the complement
 * is not there, then the value is added in the lookup table. If the complement is found,
 * then the algorithm returns true, since there is a pair that sums to the target.
 * Once the algorithm finishes iterating over all values, if the complement is not found
 * in the lookup table it means that there isn't a pair that sums to the target.
 *
 * This solution use additional memory to build the lookup table.
 *
 * @param values The list of numbers available to sum to the target.
 * @param target The value target of the sum.
 *
 * @return If there is a pair in the list of values that sums to the target.
 */
fun existsPairThatSumsToTarget(values: Collection<Int>, target: Int): Boolean {
    val lookupTable = mutableSetOf<Int>()
    for (value in values) {
        val complement = target - value
        if (complement in lookupTable) {
            return true
        } else {
            lookupTable.add(value)
        }
    }
    return false
}
