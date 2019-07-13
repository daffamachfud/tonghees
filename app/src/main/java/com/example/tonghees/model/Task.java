package com.example.tonghees.model;



import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "task_table")
public class Task {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "task")
    private String mTask;

    @NonNull
    @ColumnInfo(name = "location")
    private String mLocation;

    public Task(@NonNull String task,@NonNull String location)
    {
        this.mTask = task;
        this.mLocation = location;
    }


    public String getTask(){
        return this.mTask;
    }

    @NonNull
    public String getLocation() {
        return mLocation;
    }
}
