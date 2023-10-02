import {Shape} from './Shape';

class Circle extends Shape{
    constructor(theX : number, theY : number, private _radius : number){
        super(theX, theY);
    }

    getInfo() : string{
        return super.getInfo() + `, radius=${this._radius}`
    }
}

let myCircle = new Circle(2,5,10)

console.log(myCircle.getInfo());