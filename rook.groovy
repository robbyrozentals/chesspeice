import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder

//20 milamerters = diamiter, radius is going to be ten

double diamiter =20
double radius = diamiter/2
double heightOfBase = radius/2
double heightOfMiddle = 30
CSG base = new Cylinder(radius,heightOfBase).toCSG()
CSG middle = new Cylinder(radius-1, radius/2, heightOfMiddle).toCSG()
CSG Top = new Cylinder( radius,heightOfBase).toCSG()
			.movez(heightOfMiddle)





return[base,middle,Top]