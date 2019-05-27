#source "input.txt"
	call main
	halt
	' * array type v(offset 0)
	main:
	' * Parameters
	' * Local Variables
	enter 54
	' * Real value(offset -4)
	' * integer i(offset -6)
	' * integer j(offset -8)
	' * array type w(offset -48)
	' * Struct date(offset -54)
#line 13
	push bp
	pushi -54
	addi
	pushi 0
	addi
	ini
	storei
#line 14
	push bp
	pushi -54
	addi
	pushi 4
	addi
	pushb 97
	b2i
	storei
#line 15
	push bp
	pushi -54
	addi
	pushi 2
	addi
	push bp
	pushi -54
	addi
	pushi 0
	addi
	loadi
	push bp
	pushi -54
	addi
	pushi 4
	addi
	loadi
	muli
	pushi 12
	modi
	pushi 1
	addi
	storei
#line 16
	push bp
	pushi -54
	addi
	pushi 0
	addi
	loadi
	outi
	pushb 10
	outb
	push bp
	pushi -54
	addi
	pushi 2
	addi
	loadi
	outi
	pushb 10
	outb
	push bp
	pushi -54
	addi
	pushi 4
	addi
	loadi
	i2f
	outf
	pushb 10
	outb
#line 18
	push bp
	pushi -4
	addi
	inf
	storef
#line 20
	push bp
	pushi -6
	addi
	pushi 0
	storei
#line 21
	label0:
	push bp
	pushi -6
	addi
	loadi
	pushi 10
	lti
	jz label1
#line 22
	pusha 0
	push bp
	pushi -6
	addi
	loadi
	pushi 4
	muli
	addi
	push bp
	pushi -4
	addi
	loadf
	storef
#line 23
	push bp
	pushi -6
	addi
	loadi
	outi
	pushb 58
	outb
	pusha 0
	push bp
	pushi -6
	addi
	loadi
	pushi 4
	muli
	addi
	loadf
	outf
	pushb 32
	outb
#line 24
	push bp
	pushi -6
	addi
	loadi
	pushi 2
	modi
	jz label2
#line 25
	pushb 111
	outb
	pushb 100
	outb
	pushb 100
	outb
	pushb 10
	outb
	jmp label3
	label2:
#line 27
	pushb 101
	outb
	pushb 118
	outb
	pushb 101
	outb
	pushb 110
	outb
	pushb 10
	outb
	label3:
#line 28
	push bp
	pushi -6
	addi
	push bp
	pushi -6
	addi
	loadi
	pushi 1
	addi
	storei
	jmp label0
	label1:
#line 30
	pushb 10
	outb
#line 32
	push bp
	pushi -6
	addi
	pushi 0
	storei
#line 33
	label4:
	push bp
	pushi -6
	addi
	loadi
	pushi 4
	lti
	jz label5
#line 34
	push bp
	pushi -8
	addi
	pushi 0
	storei
#line 35
	label6:
	push bp
	pushi -8
	addi
	loadi
	pushi 5
	lti
	jz label7
#line 36
	push bp
	pushi -48
	addi
	push bp
	pushi -6
	addi
	loadi
	pushi 10
	muli
	addi
	push bp
	pushi -8
	addi
	loadi
	pushi 2
	muli
	addi
	push bp
	pushi -6
	addi
	loadi
	push bp
	pushi -8
	addi
	loadi
	addi
	storei
#line 37
	push bp
	pushi -48
	addi
	push bp
	pushi -6
	addi
	loadi
	pushi 10
	muli
	addi
	push bp
	pushi -8
	addi
	loadi
	pushi 2
	muli
	addi
	loadi
	outi
	pushb 32
	outb
#line 38
	push bp
	pushi -8
	addi
	push bp
	pushi -8
	addi
	loadi
	pushi 1
	addi
	storei
	jmp label6
	label7:
#line 40
	pushb 10
	outb
#line 41
	push bp
	pushi -6
	addi
	push bp
	pushi -6
	addi
	loadi
	pushi 1
	addi
	storei
	jmp label4
	label5:
	ret 0, 54, 0
