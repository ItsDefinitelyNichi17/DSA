package main

import (
	"fmt"
	"math"
)

func main() {
	//find the target num
	nums := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
	targetNum := 19
	var middleIndex float64

	for {
		middleIndex = math.Floor(float64(len(nums)) / 2)

		if nums[int(middleIndex)] < targetNum {
			nums = nums[int(middleIndex):]

		} else if targetNum < nums[int(middleIndex)] {
			nums = nums[:int(middleIndex)]

		} else if nums[int(middleIndex)] == targetNum {
			fmt.Println(nums[int(middleIndex)])
			break
		}
	}
}
