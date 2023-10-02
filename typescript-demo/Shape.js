"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Shape = void 0;
var Shape = /** @class */ (function () {
    function Shape(_x, _y) {
        this._x = _x;
        this._y = _y;
    }
    Shape.prototype.getInfo = function () {
        return "x=".concat(this._x, ", y=").concat(this._y);
    };
    return Shape;
}());
exports.Shape = Shape;
