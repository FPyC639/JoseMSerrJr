#include <iostream>
#include <string>

class GeometricObject{
    private:
        std::string color;
        bool filled;
    public:
        GeometricObject(std::string color, bool filled);
        std::string getColor();
        void setColor(std::string color);
        bool isFilled();
        void setFilled(bool filled);
        std::string toString();
};
GeometricObject::GeometricObject(std::string color, bool filled){
    this ->color = color;
    this -> filled = filled;
}
std::string GeometricObject:: getColor(){
    return this->color;
}
void GeometricObject::setColor(std::string color){
    this->color = color;
}
bool GeometricObject::isFilled(){
    return this->filled;
}
void GeometricObject::setFilled(bool filled){
    this->filled = filled;
}
std::string GeometricObject::toString(){
    const char * filler = (this->filled)? "True": "False";
    return "Geometric Object[ color: " + this->color + ", filled: " + filler +"]";
}
int main(){
    GeometricObject geo("blue", true);
    std::cout << geo.toString();
}