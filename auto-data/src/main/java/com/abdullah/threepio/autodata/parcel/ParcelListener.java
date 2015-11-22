package com.abdullah.threepio.autodata.parcel;

import android.os.Parcel;

/**
 * Implement this interface in class annotated with <code>AutoParcel</code> to listen to
 * parse events for some custom processing.
 */
public interface ParcelListener {

    /**
     * Called at the end of reading from <code>Parcel</code> while constructing this object.
     *
     * @param   in
     *          Parcel to read from.
     */
    void readFromParcel(Parcel in);

    /**
     * Called at the end of writing to <code>Parcel</code> from method
     * <code>Parcelable.writeToParcel()</code>.
     *
     * @param   out
     *          Parcel to write into.
     */
    void writeToParcel(Parcel out);
}
