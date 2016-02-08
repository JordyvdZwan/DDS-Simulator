package model.vectors;

public class Vector {
	private double x;
	private double y;
	private double z;
	
	/**
	 * @param x coordinate to which the x on the new factor will be set.
	 * @param y coordinate to which the y on the new factor will be set.
	 * @param z coordinate to which the z on the new factor will be set.
	 */
	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/**
	 * @return Returns the length of this vector.
	 */
	public double getLength() {
		return Math.sqrt((x * x) + (y * y) + (z * z));
	}
	
	/**
	 * @param vector the vector with which this vector will create a dot product.
	 * @return Returns the cross product of this vector and the one given.
	 */
	public Vector dotProduct(Vector vector) {
		return new Vector(x * vector.getX(), y * vector.getY(), z * vector.getZ());
	}
	
	/**
	 * @param vector the vector with which this vector will create a cross product.
	 * @return Returns the cross product of this vector and the one given.
	 */
	public Vector crossProduct(Vector vector) {
		return new Vector(((y * vector.getZ()) - (z * vector.getY())), -((z * vector.getX()) - (x * vector.getZ())), ((x * vector.getY()) - (y * vector.getX())));
	}
	
	/**
	 * @param vector
	 * @return a new vector which is this vector plus the parameter.
	 */
	public Vector addition(Vector vector) {
		return new Vector(x + vector.getX(), y + vector.getY(), z + vector.getZ());
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getZ() {
		return z;
	}
}
