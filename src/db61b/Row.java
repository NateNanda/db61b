// This is a SUGGESTED skeleton for a class that describes a single Row of a
// Table. You can throw this away if you want, but it is a good idea to try to
// understand it first.  Our solution changes or adds about 10 lines in this
// skeleton.

// Comments that start with "//" are intended to be removed from your
// solutions.
package db61b;

import java.util.Arrays;
import java.util.List;

/** A single row of a database.
 *  @author
 */
class Row {
    /** A Row whose column values are DATA.  The array DATA must not be altered
     *  subsequently. */
    Row(String[] data) {
        _data = data;
    }

    /** Given N colums and rows, returns a new row containing one column from
     *  each of the supplied ROWS.
     *
     *  The value for the ith column of this new row will come from the ith row
     *  in ROWS, using the ith entry of COLUMNS as an effective column index.
     *
     *  There is a method in the Columns class that you'll need to use,
     *  see {@link db61b.Column#getFrom}).  you're wondering why this looks like
     *  a potentially clickable link it is! Just not in source. You might
     *  consider converting this spec to HTML using the Javadoc command.
     */
    Row(List<Column> columns, Row... rows) {
        // FILL IN
    }

    /** Return my number of columns. */
    int size() {
        return _data.length; 
    }

    /** Return the value of my Kth column.  Requires that 0 <= K < size(). */
    String get(int k) {
        return _data[k]; // REPLACE WITH SOLUTION
    }

    @Override
    public boolean equals(Object obj) {
        Row other = (Row)obj;
        if(this.size()!= other.size()) {
            return false;
        } else {
            for (int i = 0 ; i  < _data.length; i++ ) {
                if(!other._data[i].equals(this._data[i])) {
                    return false;
                } 
            }
        }
        return true;
    }

    /* NOTE: Whenever you override the .equals() method for a class, you
     * should also override hashCode so as to insure that if
     * two objects are supposed to be equal, they also return the same
     * .hashCode() value (the converse need not be true: unequal objects MAY
     * also return the same .hashCode()).  The hash code is used by certain
     * Java library classes to expedite searches (see Chapter 7 of Data
     * Structures (Into Java)). */

    @Override
    public int hashCode() {
        return Arrays.hashCode(_data);
    }

    /** Contents of this row. */
    private String[] _data;
}
