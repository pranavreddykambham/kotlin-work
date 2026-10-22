// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    
    "Median of an odd-sized list" {
        median(listOf(1.0f, 3.0f, 2.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }

    "Median of an even-sized list" {
        median(listOf(1.0f, 4.0f, 2.0f, 3.0f)) shouldBe (2.5f plusOrMinus tolerance)
    }

    "Median of an unsorted list" {
        median(listOf(9.0f, 1.0f, 5.0f)) shouldBe (5.0f plusOrMinus tolerance)
    }

    "Median of a list with negative numbers" {
        median(listOf(-5.0f, -1.0f, -3.0f)) shouldBe (-3.0f plusOrMinus tolerance)
    }

})
