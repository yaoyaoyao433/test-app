package com.meituan.android.common.aidata.feature.optimize.cep;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.aidata.data.EventBean;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.aidata.utils.CollectionUtils;
import com.meituan.android.common.aidata.utils.GsonProvider;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CEPSubTable {
    private static final int MAX_DATA_COUNT = 2000;
    public static final String TABLE_NAME_TRIGGER_TABLE = "cepTriggerSubTable";
    private static final String TAG = "CEPSubTable";
    private static final String TRIGGER_NAME_PREFIX = "trigger_pv_duration_4_";
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mDataCount;
    private final List<String> mTableIndexList;
    private final String mTableName;
    private final String mTriggerName;

    public CEPSubTable(String str) {
        this(str, null);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f1b9e3b81dc6b3b7cf3a9c84f889668", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f1b9e3b81dc6b3b7cf3a9c84f889668");
        }
    }

    public CEPSubTable(@NonNull String str, @Nullable List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1afa8c3dcacff57c4f4194490ea1ce6f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1afa8c3dcacff57c4f4194490ea1ce6f");
            return;
        }
        this.mTableName = str;
        this.mTableIndexList = list;
        this.mDataCount = 0;
        this.mTriggerName = TRIGGER_NAME_PREFIX + str;
    }

    public String getTableName() {
        return this.mTableName;
    }

    public boolean createTable(SQLiteDatabase sQLiteDatabase) throws Exception {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bdabf31921436104b7889f01560af70", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bdabf31921436104b7889f01560af70")).booleanValue();
        }
        String tableName = getTableName();
        new StringBuilder("CEPSubTable--- createTable entry begin for table ").append(tableName);
        sQLiteDatabase.execSQL("create table if not exists " + tableName + "(_id integer primary key autoincrement,tm integer,uid integer,city_id integer,locate_city_id integer,lat real,lng real,msid text,lch text,push_id text,utm_source text,category text,nm text,cid text,refer_cid text,req_id text,duration integer,bid text,nt integer,seq integer,is_auto integer, tag text,tag_flatten text,val_lab text,val_lab_flatten text,query_id text, sort_id text, keyword text,dealgroup_id integer,category_id text,poi_id text,ad_id integer,order_id text,title text,biz_id text,stid text,ct_poi text,abtest text,coupon_id text,sku_id text,deal_id  text,movie_id text,goods_id text,maiton_id text,promotion_id text,trace_id text,cinema_id text,select_id text,search_id text,cat_id text,item_index text,shopuuid text,activityid text,region_id text,val_lab_custom text,url text, stm integer,mt_aurl text,app_launch_id text,app text,mge_type text,element_id text,val_act text,mreq_id text,mduration_list text,mduration_total integer,mduration_cnt integer)");
        for (String str : CollectionUtils.nonNullList(this.mTableIndexList)) {
            StringBuilder sb = new StringBuilder("create index ");
            sb.append(str);
            sb.append(" in table ");
            sb.append(tableName);
            try {
                sQLiteDatabase.execSQL("create index if not exists " + tableName + CommonConstant.Symbol.UNDERLINE + str + " on " + tableName + CommonConstant.Symbol.BRACKET_LEFT + str + " desc)");
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("create index ");
                sb2.append(str);
                sb2.append(" for table ");
                sb2.append(tableName);
                sb2.append(" failed: ");
                sb2.append(e);
            }
        }
        if (!TABLE_NAME_TRIGGER_TABLE.equals(tableName)) {
            new StringBuilder("create trigger in table ").append(tableName);
            try {
                sQLiteDatabase.execSQL("create trigger if not exists " + this.mTriggerName + " after insert on cepTriggerSubTable when new.nm = 'PD' and new.duration > 0 begin update or ignore " + tableName + " set duration=new.duration where nm in ('PV','mpt') and category = new.category and msid=new.msid and req_id = new.req_id and app_launch_id = new.app_launch_id; end;");
            } catch (Exception e2) {
                new StringBuilder("create trigger failed: ").append(e2);
            }
        }
        return true;
    }

    public void dropTable(SQLiteDatabase sQLiteDatabase) throws Exception {
        Object[] objArr = {sQLiteDatabase};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "faa6e84866c5aa601fc75670ef876dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "faa6e84866c5aa601fc75670ef876dd4");
            return;
        }
        String tableName = getTableName();
        new StringBuilder("CEPSubTable--- dropTable entry begin for ").append(tableName);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + tableName);
        StringBuilder sb = new StringBuilder("drop table ");
        sb.append(tableName);
        sb.append(" success");
        sQLiteDatabase.execSQL("DROP TRIGGER " + this.mTriggerName);
    }

    public void insertData(SQLiteDatabase sQLiteDatabase, StreamData streamData) {
        Object[] objArr = {sQLiteDatabase, streamData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "660d3698383e594ad09ecb07d2496dd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "660d3698383e594ad09ecb07d2496dd3");
            return;
        }
        StringBuilder sb = new StringBuilder("start insert data to table ");
        sb.append(this.mTableName);
        sb.append(" with data ");
        sb.append(GsonProvider.getInstance().toJson(streamData));
        sb.append(" which already had ");
        sb.append(this.mDataCount);
        sb.append(" records");
        if (streamData != null && this.mDataCount < 2000) {
            try {
                sQLiteDatabase.insert(this.mTableName, null, convertData(streamData));
                if (TABLE_NAME_TRIGGER_TABLE.equals(this.mTableName)) {
                    return;
                }
                this.mDataCount++;
            } catch (Exception e) {
                new StringBuilder("insert data failed: ").append(e);
            }
        }
    }

    public void updateExposeEvent(SQLiteDatabase sQLiteDatabase, EventBean eventBean) {
        Object[] objArr = {sQLiteDatabase, eventBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d2837be5f8f4510cf879741367ea0a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d2837be5f8f4510cf879741367ea0a7");
            return;
        }
        new StringBuilder("start updateExposeEvent in table ").append(this.mTableName);
        if (eventBean == null) {
            return;
        }
        String str = eventBean.mreq_id;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        String str2 = null;
        List<Long> list = eventBean.mduration_list;
        if (!CollectionUtils.isEmpty(list) && (str2 = new JSONArray((Collection) list).toString()) != null) {
            str2 = str2.replace(StringUtil.SPACE, "");
        }
        contentValues.put("mduration_list", str2);
        contentValues.put("mduration_total", Long.valueOf(eventBean.mduration_total));
        contentValues.put("mduration_cnt", Integer.valueOf(eventBean.mduration_cnt));
        String tableName = getTableName();
        try {
            sQLiteDatabase.update(tableName, contentValues, "mreq_id=?", new String[]{str});
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(" - updateExposeEvent to table ");
            sb.append(tableName);
            sb.append(" failed: ");
            sb.append(e);
        }
    }

    @NonNull
    private static ContentValues convertData(@NonNull StreamData streamData) {
        Object[] objArr = {streamData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "582cce2f7a04d0d4ad4601cfbc8a5142", RobustBitConfig.DEFAULT_VALUE)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "582cce2f7a04d0d4ad4601cfbc8a5142");
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("tm", Long.valueOf(streamData.tm));
        contentValues.put("uid", Long.valueOf(streamData.uid));
        contentValues.put(DataConstants.CITY_ID, Long.valueOf(streamData.city_id));
        contentValues.put("locate_city_id", Long.valueOf(streamData.locate_city_id));
        contentValues.put("lat", Double.valueOf(streamData.lat));
        contentValues.put("lng", Double.valueOf(streamData.lng));
        contentValues.put("msid", streamData.msid);
        contentValues.put("lch", streamData.lch);
        contentValues.put(DataConstants.PUSH_ID, streamData.push_id);
        contentValues.put("utm_source", streamData.utm_source);
        contentValues.put("category", streamData.category);
        contentValues.put("nm", streamData.nm);
        contentValues.put("cid", streamData.val_cid);
        contentValues.put(DataConstants.REFER_CID, streamData.val_ref);
        contentValues.put(Constants.EventInfoConsts.KEY_REQ_ID, streamData.req_id);
        long j = streamData.duration;
        if (j >= 0) {
            contentValues.put("duration", Long.valueOf(j));
        }
        contentValues.put("bid", streamData.val_bid);
        contentValues.put("nt", Integer.valueOf(streamData.nt));
        contentValues.put("seq", Long.valueOf(streamData.seq));
        contentValues.put(DataConstants.IS_AUTO, Integer.valueOf(streamData.isAuto));
        JSONObject mapToJSONObject = JsonUtil.mapToJSONObject(streamData.tag);
        if (mapToJSONObject != null) {
            contentValues.put("tag", mapToJSONObject.toString());
        }
        contentValues.put(DataConstants.TAG_FLATTEN, streamData.tagFlatten);
        JSONObject mapToJSONObject2 = JsonUtil.mapToJSONObject(streamData.val_lab);
        if (mapToJSONObject2 != null) {
            contentValues.put("val_lab", mapToJSONObject2.toString());
        }
        contentValues.put("val_lab_flatten", streamData.valLabFlatten);
        contentValues.put("query_id", streamData.queryId);
        contentValues.put("sort_id", streamData.sortId);
        contentValues.put("keyword", streamData.keyword);
        contentValues.put("dealgroup_id", Long.valueOf(streamData.dealgroupId));
        contentValues.put(DataConstants.CATEGORY_ID, streamData.categoryId);
        contentValues.put("poi_id", streamData.poiId);
        contentValues.put("ad_id", Long.valueOf(streamData.adId));
        contentValues.put("order_id", streamData.orderId);
        contentValues.put("title", streamData.title);
        contentValues.put("biz_id", streamData.bizId);
        contentValues.put("stid", streamData.stid);
        contentValues.put("ct_poi", streamData.ct_poi);
        contentValues.put("abtest", streamData.abtest);
        contentValues.put("coupon_id", streamData.couponId);
        contentValues.put("sku_id", streamData.skuId);
        contentValues.put("deal_id", streamData.dealId);
        contentValues.put("movie_id", streamData.movieId);
        contentValues.put("goods_id", streamData.goodsId);
        contentValues.put("maiton_id", streamData.maitonId);
        contentValues.put(DataConstants.PROMOTION_ID, streamData.promotionId);
        contentValues.put("trace_id", streamData.traceId);
        contentValues.put("cinema_id", streamData.cinemaId);
        contentValues.put("select_id", streamData.selectId);
        contentValues.put("search_id", streamData.searchId);
        contentValues.put("cat_id", streamData.catId);
        Long l = streamData.item_index;
        if (l.longValue() != -1) {
            contentValues.put(DataConstants.INDEX, l);
        }
        contentValues.put(DataConstants.SHOPUUID, streamData.shopUuid);
        contentValues.put(DataConstants.ACTIVITYID, streamData.activityid);
        contentValues.put("region_id", streamData.regionId);
        contentValues.put(DataConstants.VAL_LAB_CUSTOM, streamData.custom);
        contentValues.put("url", streamData.url);
        contentValues.put("stm", Long.valueOf(streamData.stm));
        contentValues.put("mt_aurl", streamData.mt_aurl);
        contentValues.put("app_launch_id", streamData.appLaunchId);
        contentValues.put("app", streamData.app);
        contentValues.put("mge_type", streamData.mge_type);
        contentValues.put("element_id", streamData.element_id);
        contentValues.put("val_act", streamData.val_act);
        contentValues.put("mreq_id", streamData.mreq_id);
        return contentValues;
    }
}
