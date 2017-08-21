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
import com.almuradev.ge.database.generated.tables.records.TblGeListingItemRecord;

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
public class TblGeListingItem extends TableImpl<TblGeListingItemRecord> {

    private static final long serialVersionUID = -2063136431;

    /**
     * The reference instance of <code>ge_dev.tbl_ge_listing_item</code>
     */
    public static final TblGeListingItem TBL_GE_LISTING_ITEM = new TblGeListingItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblGeListingItemRecord> getRecordType() {
        return TblGeListingItemRecord.class;
    }

    /**
     * The column <code>ge_dev.tbl_ge_listing_item.id</code>.
     */
    public final TableField<TblGeListingItemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ge_dev.tbl_ge_listing_item.created</code>.
     */
    public final TableField<TblGeListingItemRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>ge_dev.tbl_ge_listing_item.stack_data</code>.
     */
    public final TableField<TblGeListingItemRecord, byte[]> STACK_DATA = createField("stack_data", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

    /**
     * The column <code>ge_dev.tbl_ge_listing_item.ge_listing_id</code>.
     */
    public final TableField<TblGeListingItemRecord, Integer> GE_LISTING_ID = createField("ge_listing_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>ge_dev.tbl_ge_listing_item</code> table reference
     */
    public TblGeListingItem() {
        this("tbl_ge_listing_item", null);
    }

    /**
     * Create an aliased <code>ge_dev.tbl_ge_listing_item</code> table reference
     */
    public TblGeListingItem(String alias) {
        this(alias, TBL_GE_LISTING_ITEM);
    }

    private TblGeListingItem(String alias, Table<TblGeListingItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblGeListingItem(String alias, Table<TblGeListingItemRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TblGeListingItemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TBL_GE_LISTING_ITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TblGeListingItemRecord> getPrimaryKey() {
        return Keys.KEY_TBL_GE_LISTING_ITEM_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TblGeListingItemRecord>> getKeys() {
        return Arrays.<UniqueKey<TblGeListingItemRecord>>asList(Keys.KEY_TBL_GE_LISTING_ITEM_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TblGeListingItemRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TblGeListingItemRecord, ?>>asList(Keys.FK_GE_LISTING);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TblGeListingItem as(String alias) {
        return new TblGeListingItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TblGeListingItem rename(String name) {
        return new TblGeListingItem(name, null);
    }
}
