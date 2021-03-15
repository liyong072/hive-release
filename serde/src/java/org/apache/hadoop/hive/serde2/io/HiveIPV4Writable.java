package org.apache.hadoop.hive.serde2.io;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class HiveIPV4Writable implements WritableComparable<HiveIPV4Writable> {
    @Override
    public int compareTo(HiveIPV4Writable o) {
        return 0;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {

    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {

    }
}
