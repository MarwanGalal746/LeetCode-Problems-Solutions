package main

import (
	"strings"
)

func main() {
	backspaceCompare("y#fo##f", "y#fx#o##f")
}

// I solved the problem using two pointers technique and stack
func backspaceCompare(s string, t string) bool {

	//ignoring the #s at the start of the strings
	s = strings.TrimLeft(s, "#")
	t = strings.TrimLeft(t, "#")

	//converting s string to slice to make the characters of the string accessible
	sArr := []rune(s)
	var sStack []int //stack to insert characters that may be deleted
	for i, r := 1, 0; i < len(s); i++ {
		// if the character is not a # I will add it to the stack because it's may be deleted
		if sArr[r] != '#' {
			sStack = append(sStack, r)
		}
		r++ //increasing the least pointer
		//if the char which pointer i points to is a #, I will replace it with a # to indicate
		//that it will be ignored when I compare between two strings at the end
		if sArr[i] == '#' {
			//if the stack is not empty and the top of the stack is now a # char,
			//I'll replace this char with a # because of
			//it will be ignored when I compare between two strings at the end
			if len(sStack) > 0 && sArr[sStack[len(sStack)-1]] != '#' {
				sArr[sStack[len(sStack)-1]] = '#'
				sStack = sStack[:len(sStack)-1]
			}
		}
		//updating the string every iteration for debugging purposes :"D
		s = string(sArr)
	}
	//removing the #s from the string after processing
	//it will remove the #s of the original string and the #s which were substituted with the chars
	//which wanted to be removed
	s = strings.ReplaceAll(s, "#", "")

	//the same steps to process the other string :), I wish that this solution would be valuable to you
	tArr := []rune(t)
	var tStack []int
	for i, r := 1, 0; i < len(t); i++ {
		if tArr[r] != '#' {
			tStack = append(tStack, r)
		}
		r++
		if tArr[i] == '#' {
			if len(tStack) > 0 && tArr[tStack[len(tStack)-1]] != '#' {
				tArr[tStack[len(tStack)-1]] = '#'
				tStack = tStack[:len(tStack)-1]
			}
		}
		t = string(tArr)
	}
	t = strings.ReplaceAll(t, "#", "")
	//fmt.Println(s)
	//fmt.Println(t)

	return s == t
}
