import eu.mihosoft.vrl.v3d.CSG
import eu.mihosoft.vrl.v3d.Cylinder
import eu.mihosoft.vrl.v3d.RoundedCube
import eu.mihosoft.vrl.v3d.Sphere

double diamiter =20
double radiusofpawn = diamiter/2
double heightOfBase = radiusofpawn/2
double heightOfMiddle = 30



CSG base = new Cylinder(radiusofpawn -3,heightOfBase-3) .toCSG()
CSG middle = new Cylinder(5, // Radius at the bottom
                      		5, // Radius at the top
                      		10, // Height
                      		(int)30 //resolution
							  ).toCSG()

							  
CSG middletop  = new Cylinder(radiusofpawn-4,heightOfBase-4) .toCSG()
 .movez(heightOfMiddle/2-5)
							  
CSG Top = new Sphere(5,// Spheres radius
						10,//elevation Divisions
						10)// vertical divisions
						.toCSG()// convert to CSG to display
						.movez(heightOfMiddle/2-2)

double wheelRadius = 33.0
wheelHeight=1
double radius = 6.0
CSG profile = new RoundedCube(radius,// x dimention
					wheelRadius,// y dimention
				
				wheelHeight//  Z dimention
				)
				.cornerRadius(radius)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
				.toYMin()
				.toZMin()
				
//create a Cylinder
height = 22.5
CSG wheel_body = CSG.unionAll(
		Extrude.revolve(profile,
		(double)5, // rotation center radius, if 0 it is a circle, larger is a donut. Note it can be negative too
		(double)360,// degrees through wich it should sweep
		(int)10)//number of sweep increments
		)
		.movez(wheelHeight*1.5)
		
		
		
		
	middle = middle.difference(wheel_body)
		
		
						
						
	return[base,middle,middletop,Top,wheel_body]