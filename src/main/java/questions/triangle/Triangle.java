package questions.triangle;

public class Triangle {

    int aSide;
    int bSide;
    int cSide;


    public Triangle() {
    }

    public Triangle(int aSide, int bSide, int cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public int getaSide() {
        return aSide;
    }


    public int getbSide() {
        return bSide;
    }

    public int getcSide() {
        return cSide;
    }

    public boolean checkIsItRectangularTriangle(){

        return Math.pow(aSide, 2) + Math.pow(bSide, 2) == Math.pow(cSide, 2) ||
                Math.pow(aSide, 2) + Math.pow(cSide, 2) == Math.pow(bSide, 2) ||
                Math.pow(cSide, 2) + Math.pow(bSide, 2) == Math.pow(aSide, 2);

    }

    public double getHypotenuse(){

        boolean hypoteneuseCheckerSideA =  Math.pow(cSide, 2) + Math.pow(bSide, 2) == Math.pow(aSide, 2);
        boolean hypoteneuseCheckerSideB =   Math.pow(aSide, 2) + Math.pow(cSide, 2) == Math.pow(bSide, 2);
        boolean hypoteneuseCheckerSideC =  Math.pow(aSide, 2) + Math.pow(bSide, 2) == Math.pow(cSide, 2);

        if(hypoteneuseCheckerSideA){

            return Math.sqrt( Math.pow(cSide, 2) + Math.pow(bSide, 2));
        } else if (hypoteneuseCheckerSideB){
            return Math.sqrt( Math.pow(aSide, 2) + Math.pow(cSide, 2));
        }else {

            return Math.sqrt(Math.pow(aSide, 2) + Math.pow(bSide, 2));

        }


    }



    public double setTriangleArea(){

        if(aSide == getHypotenuse()){

            return (bSide * cSide)/2;

        }else if (bSide == getHypotenuse()){

            return (aSide * cSide)/2;
        } else {

            return (aSide * bSide)/2;
        }




    }

    public double getTriangleCircumference(){

        return aSide + bSide +cSide;
    }
}
