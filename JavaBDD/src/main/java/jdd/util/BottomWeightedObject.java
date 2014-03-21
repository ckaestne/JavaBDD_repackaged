package jdd.util;


/**
 * represent the least lement in an ordered set. used by binary-heaps
 *
 * @see BinaryHeap
 */


// "the botten is nådd"-object:
/* package */ class BottomWeightedObject implements WeightedObject {
	public Object object() { return this; }
	public double weight() { return Double.NEGATIVE_INFINITY; }
}
