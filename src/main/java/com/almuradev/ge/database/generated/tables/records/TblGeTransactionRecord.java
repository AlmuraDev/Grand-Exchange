/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
/*
 * This file is generated by jOOQ.
*/
package com.almuradev.ge.database.generated.tables.records;


import com.almuradev.ge.database.generated.tables.TblGeTransaction;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class TblGeTransactionRecord extends UpdatableRecordImpl<TblGeTransactionRecord> implements Record5<Integer, Timestamp, byte[], Integer, Integer> {

    private static final long serialVersionUID = 1256397860;

    /**
     * Setter for <code>ge_dev.tbl_ge_transaction.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>ge_dev.tbl_ge_transaction.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>ge_dev.tbl_ge_transaction.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>ge_dev.tbl_ge_transaction.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>ge_dev.tbl_ge_transaction.buyer_unique_id</code>.
     */
    public void setBuyerUniqueId(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>ge_dev.tbl_ge_transaction.buyer_unique_id</code>.
     */
    public byte[] getBuyerUniqueId() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>ge_dev.tbl_ge_transaction.quantity</code>.
     */
    public void setQuantity(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>ge_dev.tbl_ge_transaction.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ge_dev.tbl_ge_transaction.ge_listing_item_data_id</code>.
     */
    public void setGeListingItemDataId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>ge_dev.tbl_ge_transaction.ge_listing_item_data_id</code>.
     */
    public Integer getGeListingItemDataId() {
        return (Integer) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Timestamp, byte[], Integer, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Timestamp, byte[], Integer, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TblGeTransaction.TBL_GE_TRANSACTION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return TblGeTransaction.TBL_GE_TRANSACTION.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field3() {
        return TblGeTransaction.TBL_GE_TRANSACTION.BUYER_UNIQUE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TblGeTransaction.TBL_GE_TRANSACTION.QUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TblGeTransaction.TBL_GE_TRANSACTION.GE_LISTING_ITEM_DATA_ID;
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
        return getBuyerUniqueId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getGeListingItemDataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeTransactionRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeTransactionRecord value2(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeTransactionRecord value3(byte... value) {
        setBuyerUniqueId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeTransactionRecord value4(Integer value) {
        setQuantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeTransactionRecord value5(Integer value) {
        setGeListingItemDataId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeTransactionRecord values(Integer value1, Timestamp value2, byte[] value3, Integer value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblGeTransactionRecord
     */
    public TblGeTransactionRecord() {
        super(TblGeTransaction.TBL_GE_TRANSACTION);
    }

    /**
     * Create a detached, initialised TblGeTransactionRecord
     */
    public TblGeTransactionRecord(Integer id, Timestamp created, byte[] buyerUniqueId, Integer quantity, Integer geListingItemDataId) {
        super(TblGeTransaction.TBL_GE_TRANSACTION);

        set(0, id);
        set(1, created);
        set(2, buyerUniqueId);
        set(3, quantity);
        set(4, geListingItemDataId);
    }
}