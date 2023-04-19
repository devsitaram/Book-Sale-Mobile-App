package com.example.booksale.features.database;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;

@SuppressWarnings("AndroidUnresolvedRoomSqlReference")
@androidx.room.Dao
public interface Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Completable insertCustomerData(List<CustomerPojo> customerPojo);

    @Query("Select * From CustomerPojo")
    Single<List<CustomerPojo>> getAllCustomerData();

    @Update
    void updateCustomerData(CustomerPojo customerPojo);

    @Delete
    Completable deleteCustomerData(CustomerPojo customerPojo);
}
