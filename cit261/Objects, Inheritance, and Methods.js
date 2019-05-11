// Object Creation Functions, Inheritance, Properties
// Methods, and Instatiation

function Computer(drive, processor, os, graphics)
{
    this.drive = drive;
    this.processor = processor;
    this.os = os;
    this.graphics = graphics;
}

Computer.prototype.specs = function() {
    console.log("This computer is a desktop that currently has these specs: ");
    console.log("Hard Drive - " + this.drive);
    console.log("Processor - " + this.processor);
    console.log("OS - " + this.os);
    console.log("Graphics - " + this.graphics);
    console.log("")
}

function Laptop(drive, processor, os, graphics, brand)
{
    Computer.call(this, drive, processor, os, graphics);
    this.brand = brand;
}

Laptop.prototype.specs = function()
{
    console.log("This computer is a laptop that currently has these specs: ");
    console.log("Hard Drive - " + this.drive);
    console.log("Processor - " + this.processor);
    console.log("OS - " + this.os);
    console.log("Graphics - " + this.graphics);
    console.log("Brand - " + this.brand);
    console.log("")
}

var laptop1 = new Laptop('Seagate', 'AMD', 'Windows 7', 'AMD', 'Dell');
var computer1 = new Computer('Western Digital', 'Intel', 'Windows 10', 'NVIDIA');
var laptop2 = new Laptop('Barracuda', 'Apple A5', 'OS X', 'On-Board graphics', 'Apple Macbook Pro')
computer1.specs();
laptop1.specs();
laptop2.specs();
