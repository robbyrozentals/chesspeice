import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cube
import eu.mihosoft.vrl.v3d.Cylinder

//20 milamerters = diamiter, radius is going to be ten

double diamiter =20
double radius = diamiter/2
double heightOfBase = radius/2
double heightOfMiddle = 30
double heightOfTheCrownCutter = 2
double denpthOfTheCrownCutter = 4
CSG base = new Cylinder(radius,heightOfBase).toCSG()
CSG middle = new Cylinder(radius-1, radius/2, heightOfMiddle).toCSG()
CSG Top = new Cylinder( radius,heightOfBase).toCSG()
			.movez(heightOfMiddle)
CSG TopCutter = new Cube(diamiter+1, heightOfTheCrownCutter, denpthOfTheCrownCutter).toCSG()
	              .movez(heightOfMiddle+heightOfBase-denpthOfTheCrownCutter/2)
Top = Top.difference(TopCutter)
Top = Top.difference(TopCutter.rotz(60))
Top = Top.difference(TopCutter.rotz(-60))
 CSG TopMiddleCutter = new Cylinder(radius-2,heightOfBase).toCSG()
                        .movez(heightOfMiddle+heightOfBase-denpthOfTheCrownCutter)
Top = Top.difference(TopMiddleCutter)					
 



return[base,middle,Top]