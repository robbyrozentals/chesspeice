import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.Sphere

double diamiter =20
double radius = diamiter/2
double heightOfBase = radius/2
double heightOfMiddle = 30



CSG base = new Cylinder(radius-3,heightOfBase-3) .toCSG()
CSG middle = new Cylinder(5, // Radius at the bottom
                      		5, // Radius at the top
                      		10, // Height
                      		(int)30 //resolution
							  ).toCSG()

CSG Top = new Sphere(5,// Spheres radius
						10,//elevation Divisions
						10)// vertical divisions
						.toCSG()// convert to CSG to display
						.movez(heightOfMiddle/2-2)
						
	return[base,middle,Top]