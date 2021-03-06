/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
/*
 * This file is generated by jOOQ.
*/
package com.almuradev.ge.database.generated.tables.records;


import com.almuradev.ge.database.generated.tables.TblGeListingItem;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblGeListingItemRecord extends UpdatableRecordImpl<TblGeListingItemRecord> implements Record4<Integer, Timestamp, byte[], Integer> {

    private static final long serialVersionUID = 580351280;

    /**
     * Setter for <code>ge_dev.tbl_ge_listing_item.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ge_dev.tbl_ge_listing_item.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ge_dev.tbl_ge_listing_item.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>ge_dev.tbl_ge_listing_item.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>ge_dev.tbl_ge_listing_item.stack_data</code>.
     */
    public void setStackData(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>ge_dev.tbl_ge_listing_item.stack_data</code>.
     */
    public byte[] getStackData() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>ge_dev.tbl_ge_listing_item.ge_listing_id</code>.
     */
    public void setGeListingId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ge_dev.tbl_ge_listing_item.ge_listing_id</code>.
     */
    public Integer getGeListingId() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, byte[], Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Timestamp, byte[], Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblGeListingItem.TBL_GE_LISTING_ITEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return TblGeListingItem.TBL_GE_LISTING_ITEM.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field3() {
        return TblGeListingItem.TBL_GE_LISTING_ITEM.STACK_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TblGeListingItem.TBL_GE_LISTING_ITEM.GE_LISTING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value3() {
        return getStackData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getGeListingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeListingItemRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeListingItemRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeListingItemRecord value3(byte... value) {
        setStackData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeListingItemRecord value4(Integer value) {
        setGeListingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeListingItemRecord values(Integer value1, Timestamp value2, byte[] value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblGeListingItemRecord
     */
    public TblGeListingItemRecord() {
        super(TblGeListingItem.TBL_GE_LISTING_ITEM);
    }

    /**
     * Create a detached, initialised TblGeListingItemRecord
     */
    public TblGeListingItemRecord(Integer id, Timestamp created, byte[] stackData, Integer geListingId) {
        super(TblGeListingItem.TBL_GE_LISTING_ITEM);

        set(0, id);
        set(1, created);
        set(2, stackData);
        set(3, geListingId);
    }
}
