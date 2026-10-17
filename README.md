# Week-2-HW-Assignment
Algorithms for All Five Java Programs
Algorithm 1: Vowel and Consonant Counter
Start.
Read a string from the user.
Initialize vowels = 0 and consonants = 0.
Traverse each character in the string using charAt().
Convert the character to lowercase.
If the character is a vowel (a, e, i, o, u), increment vowels.
Otherwise, if it is an English letter, increment consonants.
Ignore spaces and other non-letter characters.
Display the total number of vowels and consonants.
Stop.
Algorithm 2: CSV Student Record Parser
Start.
Read a CSV record in the format Name,RollNumber,Department.
Split the input using split(",", -1).
Check whether the resulting array contains exactly three fields.
If the number of fields is not three, print Invalid Record.
Otherwise, remove unnecessary leading and trailing spaces from each field.
Display the student name, roll number, and department in the required format.
Stop.
Algorithm 3: File Extension Validator
Start.
Read a filename from the user.
Find the position of the last dot using lastIndexOf('.').
If the dot is missing, occurs at the beginning, or is the last character, reject the filename.
Extract the extension using substring().
Compare the extension case-insensitively with pdf, docx, and zip.
If the extension matches any accepted type, print Accepted.
Otherwise, print Rejected — invalid file type.
Stop.
Algorithm 4: Masked Phone Number Formatter
Start.
Read the phone number as a string.
Remove leading and trailing spaces.
Check whether the phone number contains at least four characters.
If it contains fewer than four characters, print Invalid phone number.
Otherwise, initialize a StringBuilder.
Append * for every character except the last four.
Append the last four characters using substring().
Display the masked phone number.
Stop.
Algorithm 5: Bank Transaction Reference Generator and Validator
Start.
Read the raw transaction reference.
Remove leading and trailing spaces using trim().
Convert only the first three characters to uppercase.
Check whether the normalized reference contains exactly 14 characters.
If the length is incorrect, display the length validation error.
Check whether the first three characters are letters using Character.isLetter().
If the bank code contains a non-letter, display the bank-code validation error.
Check whether the remaining 11 characters are digits using Character.isDigit().
If any character is not a digit, display the body validation error.
Extract the bank code, date, and sequence number using substring().
Format the six-digit date from ddMMyy to dd/MM/yy.
Use StringBuilder to construct the formatted output.
Display the formatted reference if validation succeeds.
Stop.
Conclusion

These five algorithms demonstrate Java string traversal, splitting, extraction, case-insensitive comparison, character validation, masking, and formatted output.
