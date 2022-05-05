package main

import "fmt"

func main() {
	fmt.Println(balancedStringSplit("LLLLRRRR"))
}

func balancedStringSplit(s string) int {
	str := []rune(s)
	bal := 0
	res := 0
	for i := 0; i < len(s); i++ {
		if str[i] == 'R' {
			bal++
		} else {
			bal--
		}
		if bal == 0 {
			res++
		}
	}
	return res
}
