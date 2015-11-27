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
    void onReadParcel(Parcel in);

    /**
     * Called at the end of writing to <code>Parcel</code> from method
     * <code>Parcelable.writeToParcel()</code>.
     *
     * @param   out
     *          Parcel to write into.
     *
     * @param   flags
     *          Additional flags about how the object should be written.
     */
    void onWriteParcel(Parcel out, int flags);
}
