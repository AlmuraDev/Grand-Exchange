/*
 * This file is part of Grand Exchange, All Rights Reserved.
 *
 * Copyright (c) AlmuraDev <http://github.com/AlmuraDev/>
 */
/*
 * This file is generated by jOOQ.
*/
package com.almuradev.ge.database.generated.tables;


import com.almuradev.ge.database.generated.GeDev;
import com.almuradev.ge.database.generated.Keys;
import com.almuradev.ge.database.generated.tables.records.TblGeTransactionRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class TblGeTransaction extends TableImpl<TblGeTransactionRecord> {

    private static final long serialVersionUID = 645052655;

    /**
     * The reference instance of <code>ge_dev.tbl_ge_transaction</code>
     */
    public static final TblGeTransaction TBL_GE_TRANSACTION = new TblGeTransaction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblGeTransactionRecord> getRecordType() {
        return TblGeTransactionRecord.class;
    }

    /**
     * The column <code>ge_dev.tbl_ge_transaction.id</code>.
     */
    public final TableField<TblGeTransactionRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ge_dev.tbl_ge_transaction.created</code>.
     */
    public final TableField<TblGeTransactionRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>ge_dev.tbl_ge_transaction.buyer_unique_id</code>.
     */
    public final TableField<TblGeTransactionRecord, byte[]> BUYER_UNIQUE_ID = createField("buyer_unique_id", org.jooq.impl.SQLDataType.BINARY.length(16).nullable(false), this, "");

    /**
     * The column <code>ge_dev.tbl_ge_transaction.quantity</code>.
     */
    public final TableField<TblGeTransactionRecord, Integer> QUANTITY = createField("quantity", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>ge_dev.tbl_ge_transaction.ge_listing_item_data_id</code>.
     */
    public final TableField<TblGeTransactionRecord, Integer> GE_LISTING_ITEM_DATA_ID = createField("ge_listing_item_data_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>ge_dev.tbl_ge_transaction</code> table reference
     */
    public TblGeTransaction() {
        this("tbl_ge_transaction", null);
    }

    /**
     * Create an aliased <code>ge_dev.tbl_ge_transaction</code> table reference
     */
    public TblGeTransaction(String alias) {
        this(alias, TBL_GE_TRANSACTION);
    }

    private TblGeTransaction(String alias, Table<TblGeTransactionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblGeTransaction(String alias, Table<TblGeTransactionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return GeDev.GE_DEV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TblGeTransactionRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBL_GE_TRANSACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblGeTransactionRecord> getPrimaryKey() {
        return Keys.KEY_TBL_GE_TRANSACTION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblGeTransactionRecord>> getKeys() {
        return Arrays.<UniqueKey<TblGeTransactionRecord>>asList(Keys.KEY_TBL_GE_TRANSACTION_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TblGeTransactionRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TblGeTransactionRecord, ?>>asList(Keys.FK_GE_LISTING_ITEM_DATA);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeTransaction as(String alias) {
        return new TblGeTransaction(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TblGeTransaction rename(String name) {
        return new TblGeTransaction(name, null);
    }
}