package main

import (
	"fmt"
)

func main() {
	// Find the Largest Number

	nums := [6]int{5, 8, 6, 3, 20, 12}

	largestNum := nums[0]
	for i, _ := range nums {
		var nextNum int
		fmt.Print(i)
		if i < len(nums)-1 {
			nextNum = nums[i+1]
		}
		if largestNum < nextNum {
			largestNum = nextNum
		}
	}
	fmt.Print(largestNum)
}
