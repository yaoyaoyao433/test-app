package com.meituan.android.common.locate.cache;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.locate.model.MTAddress;
import com.meituan.android.common.locate.model.MTCellInfo;
import com.meituan.android.common.locate.reporter.AESUtils;
import com.meituan.android.common.locate.reporter.f;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private c a;
    private volatile SQLiteDatabase b;
    private Context c;

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae21676b41cbdb1e2d237ec072bf9354", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae21676b41cbdb1e2d237ec072bf9354");
        } else {
            this.c = context;
        }
    }

    private MtLocation a(JSONObject jSONObject) {
        MtLocation mtLocation;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ba3c9e266beced608bfc23ffec22c9a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ba3c9e266beced608bfc23ffec22c9a6");
        }
        try {
            mtLocation = new MtLocation(jSONObject.getString("provider"));
            try {
                mtLocation.setAccuracy((float) jSONObject.getDouble(JsBridgeResult.PROPERTY_LOCATION_ACCURACY));
                mtLocation.setLatitude(jSONObject.getDouble(Constants.PRIVACY.KEY_LATITUDE));
                mtLocation.setLongitude(jSONObject.getDouble(Constants.PRIVACY.KEY_LONGITUDE));
                mtLocation.setTime(jSONObject.getLong("time"));
                Bundle bundle = new Bundle();
                JSONObject optJSONObject = jSONObject.optJSONObject("extra");
                if (optJSONObject != null) {
                    bundle.putString("locationType", optJSONObject.has("locationType") ? optJSONObject.getString("locationType") : "");
                    String string = optJSONObject.has(GearsLocator.COUNTRY) ? optJSONObject.getString(GearsLocator.COUNTRY) : "";
                    String string2 = optJSONObject.has("province") ? optJSONObject.getString("province") : "";
                    String string3 = optJSONObject.has(GearsLocator.DISTRICT) ? optJSONObject.getString(GearsLocator.DISTRICT) : "";
                    String string4 = optJSONObject.has("city") ? optJSONObject.getString("city") : "";
                    String string5 = optJSONObject.has(GearsLocator.DETAIL) ? optJSONObject.getString(GearsLocator.DETAIL) : "";
                    String string6 = optJSONObject.has(GearsLocator.AD_CODE) ? optJSONObject.getString(GearsLocator.AD_CODE) : "";
                    String string7 = optJSONObject.has(GearsLocator.TOWN_CODE) ? optJSONObject.getString(GearsLocator.TOWN_CODE) : "";
                    String string8 = optJSONObject.has(GearsLocator.TOWN_SHIP) ? optJSONObject.getString(GearsLocator.TOWN_SHIP) : "";
                    bundle.putString(GearsLocator.ADDRESS, optJSONObject.has(GearsLocator.ADDRESS) ? optJSONObject.getString(GearsLocator.ADDRESS) : "");
                    bundle.putString(GearsLocator.COUNTRY, string);
                    bundle.putString("province", string2);
                    bundle.putString(GearsLocator.DISTRICT, string3);
                    bundle.putString("city", string4);
                    bundle.putString(GearsLocator.DETAIL, string5);
                    bundle.putString(GearsLocator.AD_CODE, string6);
                    bundle.putString(GearsLocator.INDOOR, optJSONObject.has(GearsLocator.INDOOR) ? optJSONObject.getString(GearsLocator.INDOOR) : "");
                    bundle.putString("id", optJSONObject.has("id") ? optJSONObject.getString("id") : "");
                    bundle.putString(GearsLocator.MALL_ID_TYPE, optJSONObject.has(GearsLocator.MALL_ID_TYPE) ? optJSONObject.getString(GearsLocator.MALL_ID_TYPE) : "");
                    bundle.putString("name", optJSONObject.has("name") ? optJSONObject.getString("name") : "");
                    bundle.putDouble(GearsLocator.MALL_WEIGHT, optJSONObject.has(GearsLocator.MALL_WEIGHT) ? optJSONObject.getDouble(GearsLocator.MALL_WEIGHT) : 0.0d);
                    bundle.putInt("type", optJSONObject.has("type") ? optJSONObject.getInt("type") : -1);
                    bundle.putInt(GearsLocator.MALL_FLOOR, optJSONObject.has(GearsLocator.MALL_FLOOR) ? optJSONObject.getInt(GearsLocator.MALL_FLOOR) : -1);
                    bundle.putLong(GearsLocator.DP_CITY_ID, optJSONObject.has(GearsLocator.DP_CITY_ID) ? optJSONObject.getLong(GearsLocator.DP_CITY_ID) : -1L);
                    bundle.putLong(GearsLocator.MT_CITY_ID, optJSONObject.has(GearsLocator.MT_CITY_ID) ? optJSONObject.getLong(GearsLocator.MT_CITY_ID) : -1L);
                    bundle.putInt(GearsLocator.INDOOR_TYPE, optJSONObject.has(GearsLocator.INDOOR_TYPE) ? optJSONObject.getInt(GearsLocator.INDOOR_TYPE) : -1);
                    bundle.putDouble("gpslat", optJSONObject.has("gpslat") ? optJSONObject.getDouble("gpslat") : 0.0d);
                    bundle.putDouble("gpslng", optJSONObject.has("gpslng") ? optJSONObject.getDouble("gpslng") : 0.0d);
                    bundle.putString(GearsLocator.FROM_WHERE, optJSONObject.has(GearsLocator.FROM_WHERE) ? optJSONObject.getString(GearsLocator.FROM_WHERE) : "");
                    bundle.putInt(GearsLocator.LOC_TYPE, optJSONObject.has(GearsLocator.LOC_TYPE) ? optJSONObject.getInt(GearsLocator.LOC_TYPE) : -1);
                    bundle.putInt(GearsLocator.REQ_TYPE, optJSONObject.has(GearsLocator.REQ_TYPE) ? optJSONObject.getInt(GearsLocator.REQ_TYPE) : 0);
                    bundle.putInt(com.meituan.metrics.common.Constants.SPEED_METER_STEP, optJSONObject.has(com.meituan.metrics.common.Constants.SPEED_METER_STEP) ? optJSONObject.getInt(com.meituan.metrics.common.Constants.SPEED_METER_STEP) : 0);
                    bundle.putInt("type", optJSONObject.has("type") ? optJSONObject.getInt("type") : 0);
                    bundle.putString("from", optJSONObject.has("from") ? optJSONObject.getString("from") : "");
                    bundle.putParcelable("mtaddress", new MTAddress(string, string2, string4, string3, string5, string6, string7, string8));
                    bundle.putString(GearsLocator.DP_NAME, optJSONObject.has(GearsLocator.DP_NAME) ? optJSONObject.getString(GearsLocator.DP_NAME) : "");
                    String optString = optJSONObject.optString("openCityStr", "");
                    bundle.putString("openCityStr", optString);
                    LocationUtils.a(optString, bundle);
                }
                mtLocation.setExtras(bundle);
            } catch (Throwable th) {
                th = th;
                LogUtils.a("locationJsonToObject exception: " + th.getMessage());
                return mtLocation;
            }
        } catch (Throwable th2) {
            th = th2;
            mtLocation = null;
        }
        return mtLocation;
    }

    @TargetApi(12)
    private JSONObject a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d45b98d11429f4a07049fafe6fa429da", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d45b98d11429f4a07049fafe6fa429da");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("provider", mtLocation.getProvider());
            jSONObject.put(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, mtLocation.getAccuracy());
            jSONObject.put(Constants.PRIVACY.KEY_LATITUDE, Double.isNaN(mtLocation.getLatitude()) ? 0.0d : mtLocation.getLatitude());
            jSONObject.put(Constants.PRIVACY.KEY_LONGITUDE, Double.isNaN(mtLocation.getLongitude()) ? 0.0d : mtLocation.getLongitude());
            jSONObject.put("time", mtLocation.getTime());
            JSONObject jSONObject2 = new JSONObject();
            Bundle extras = mtLocation.getExtras();
            if (extras != null) {
                jSONObject2.put("locationType", extras.getString("locationType", ""));
                jSONObject2.put(GearsLocator.ADDRESS, extras.getString(GearsLocator.ADDRESS, ""));
                jSONObject2.put(GearsLocator.COUNTRY, extras.getString(GearsLocator.COUNTRY, ""));
                jSONObject2.put("province", extras.getString("province", ""));
                jSONObject2.put(GearsLocator.DISTRICT, extras.getString(GearsLocator.DISTRICT, ""));
                jSONObject2.put("city", extras.getString("city", ""));
                jSONObject2.put(GearsLocator.DETAIL, extras.getString(GearsLocator.DETAIL, ""));
                jSONObject2.put(GearsLocator.AD_CODE, extras.getString(GearsLocator.AD_CODE, ""));
                jSONObject2.put(GearsLocator.INDOOR, extras.getString(GearsLocator.INDOOR, ""));
                jSONObject2.put("id", extras.getString("id", ""));
                jSONObject2.put(GearsLocator.MALL_ID_TYPE, extras.getString(GearsLocator.MALL_ID_TYPE, ""));
                jSONObject2.put("name", extras.getString("name", ""));
                jSONObject2.put(GearsLocator.MALL_WEIGHT, extras.getDouble(GearsLocator.MALL_WEIGHT, 0.0d));
                jSONObject2.put("type", extras.getInt("type", -1));
                jSONObject2.put(GearsLocator.MALL_FLOOR, extras.getInt(GearsLocator.MALL_FLOOR, -1));
                jSONObject2.put(GearsLocator.DP_CITY_ID, extras.getLong(GearsLocator.DP_CITY_ID, -1L));
                jSONObject2.put(GearsLocator.MT_CITY_ID, extras.getLong(GearsLocator.MT_CITY_ID, -1L));
                jSONObject2.put(GearsLocator.INDOOR_TYPE, extras.getInt(GearsLocator.INDOOR_TYPE, -1));
                jSONObject2.put("gpslat", extras.getDouble("gpslat", 0.0d));
                jSONObject2.put("gpslng", extras.getDouble("gpslng", 0.0d));
                jSONObject2.put(GearsLocator.FROM_WHERE, extras.getString(GearsLocator.FROM_WHERE, ""));
                jSONObject2.put(GearsLocator.LOC_TYPE, extras.getInt(GearsLocator.LOC_TYPE, -1));
                jSONObject2.put(GearsLocator.REQ_TYPE, extras.getInt(GearsLocator.REQ_TYPE, 0));
                jSONObject2.put(com.meituan.metrics.common.Constants.SPEED_METER_STEP, extras.getInt(com.meituan.metrics.common.Constants.SPEED_METER_STEP, 0));
                jSONObject2.put("type", extras.getInt("type", 0));
                jSONObject2.put("from", extras.getString("from", ""));
                MTAddress mTAddress = (MTAddress) extras.getParcelable("mtaddress");
                if (mTAddress != null) {
                    jSONObject2.put(GearsLocator.TOWN_CODE, mTAddress.getTownCode());
                    jSONObject2.put(GearsLocator.TOWN_SHIP, mTAddress.getTownShip());
                }
                jSONObject2.put(GearsLocator.DP_NAME, extras.getString(GearsLocator.DP_NAME, ""));
                jSONObject2.put("openCityStr", extras.getString("openCityStr", ""));
            }
            jSONObject.put("extra", jSONObject2);
        } catch (Exception e) {
            LogUtils.a("locationObjectToJson exception: " + e.getMessage());
        }
        return jSONObject;
    }

    private JSONObject a(GearsLocator.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cf566857c087c8802f2ec48e195aac9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cf566857c087c8802f2ec48e195aac9");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("postId", aVar.b());
            JSONArray jSONArray = new JSONArray();
            for (GearsLocator.a.C0214a c0214a : aVar.c()) {
                if (c0214a != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("SSID", c0214a.a);
                    jSONObject2.put("BSSID", c0214a.b);
                    jSONObject2.put("frequency", c0214a.d);
                    jSONObject2.put("level", c0214a.c);
                    jSONArray.put(jSONObject2);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            for (MTCellInfo mTCellInfo : aVar.d()) {
                if (mTCellInfo != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("mnc", mTCellInfo.mnc);
                    jSONObject3.put("lac", mTCellInfo.lac);
                    jSONObject3.put("cid", mTCellInfo.cid);
                    jSONObject3.put(Message.SID, mTCellInfo.sid);
                    jSONObject3.put("nid", mTCellInfo.nid);
                    jSONObject3.put("bid", mTCellInfo.bid);
                    jSONObject3.put("cdmalon", mTCellInfo.cdmalon);
                    jSONObject3.put("cdmalat", mTCellInfo.cdmalat);
                    jSONObject3.put("rss", mTCellInfo.rss);
                    jSONObject3.put("mcc", mTCellInfo.mcc);
                    if (com.meituan.android.common.locate.reporter.b.a(this.c).c()) {
                        jSONObject3.put("pci", mTCellInfo.pci);
                        jSONObject3.put("tac", mTCellInfo.tac);
                        jSONObject3.put("ci", mTCellInfo.ci);
                        jSONObject3.put("nci", mTCellInfo.nci);
                    }
                    jSONObject3.put("radio_type", mTCellInfo.radio_type);
                    LogUtils.a("cell db info" + jSONObject3.toString());
                    jSONArray2.put(jSONObject3);
                }
            }
            jSONObject.put("scanResult", jSONArray);
            jSONObject.put("cellInfo", jSONArray2);
            jSONObject.put("location", a(aVar.a()));
        } catch (Exception e) {
            LogUtils.a("GearObjectToJson exception: " + e.getMessage());
        }
        return jSONObject;
    }

    private GearsLocator.a b(JSONObject jSONObject) {
        GearsLocator.a aVar;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17a0733a8b535bacc42f2be4ce4834bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (GearsLocator.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17a0733a8b535bacc42f2be4ce4834bc");
        }
        try {
            int i = jSONObject.getInt("postId");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("scanResult");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    arrayList.add(new GearsLocator.a.C0214a(jSONObject2.getString("SSID"), jSONObject2.getString("BSSID"), jSONObject2.getInt("level"), jSONObject2.getInt("frequency")));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("cellInfo");
            if (optJSONArray2 != null) {
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i3);
                    MTCellInfo mTCellInfo = new MTCellInfo();
                    mTCellInfo.mnc = jSONObject3.getInt("mnc");
                    mTCellInfo.lac = jSONObject3.getLong("lac");
                    mTCellInfo.cid = jSONObject3.getLong("cid");
                    mTCellInfo.sid = jSONObject3.getLong(Message.SID);
                    mTCellInfo.nid = jSONObject3.getLong("nid");
                    mTCellInfo.bid = jSONObject3.getLong("bid");
                    mTCellInfo.cdmalat = jSONObject3.getLong("cdmalat");
                    mTCellInfo.cdmalon = jSONObject3.getLong("cdmalon");
                    mTCellInfo.rss = jSONObject3.getLong("rss");
                    mTCellInfo.mcc = jSONObject3.getInt("mcc");
                    if (com.meituan.android.common.locate.reporter.b.a(this.c).c()) {
                        mTCellInfo.pci = jSONObject3.getInt("pci");
                        mTCellInfo.tac = jSONObject3.getInt("tac");
                        mTCellInfo.ci = jSONObject3.getInt("ci");
                        mTCellInfo.nci = jSONObject3.getLong("nci");
                    }
                    mTCellInfo.radio_type = jSONObject3.getString("radio_type");
                    arrayList2.add(mTCellInfo);
                }
            }
            aVar = new GearsLocator.a(i, arrayList, arrayList2, GearsLocator.a.C0214a.class);
        } catch (Exception e) {
            e = e;
            aVar = null;
        }
        try {
            aVar.a(a(jSONObject.getJSONObject("location")));
        } catch (Exception e2) {
            e = e2;
            LogUtils.a("gearInfoJsonToObject exception :" + e.getMessage());
            return aVar;
        }
        return aVar;
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4659dd88ec13dd8e8da5b092011cdc6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4659dd88ec13dd8e8da5b092011cdc6") : AESUtils.a("LOCATE_ENCRTYPT_KEYZ", str);
    }

    private String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8db8b13bd41c615796de9671f5b2d6b0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8db8b13bd41c615796de9671f5b2d6b0") : AESUtils.b("LOCATE_ENCRTYPT_KEYZ", str);
    }

    public synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1da95a76a924db81d555ede8d91e3ec2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1da95a76a924db81d555ede8d91e3ec2");
            return;
        }
        Cursor c = c();
        if (c != null) {
            try {
                int count = c.getCount();
                if (count > 100) {
                    this.b.delete("MTLocationTable", "_id <= ?", new String[]{String.valueOf(count - 100)});
                }
                c.moveToFirst();
                long currentTimeMillis = System.currentTimeMillis();
                while (!c.isAfterLast()) {
                    try {
                        long j = c.getLong(4);
                        long j2 = f.b().getInt("db_cache_duration_limit", 12) * 60 * 60 * 1000;
                        if (j > currentTimeMillis || currentTimeMillis - j > j2) {
                            this.b.delete("MTLocationTable", "TIME = ?", new String[]{String.valueOf(j)});
                        }
                    } catch (Exception e) {
                        LogUtils.a("LocationDbManager delete overdue Location error: " + e.getMessage());
                    }
                    c.moveToNext();
                }
                c.close();
                d();
            } catch (Exception e2) {
                LogUtils.a("LocationDbManager delete Location error: " + e2.getMessage());
                c.close();
                d();
            }
        }
    }

    public synchronized void a(GearsLocator.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8fa1865cc30e983894b767ceeaa2bfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8fa1865cc30e983894b767ceeaa2bfa");
            return;
        }
        ContentValues contentValues = new ContentValues();
        MtLocation a = aVar.a();
        if (a != null && a.getAccuracy() >= 20.0f) {
            contentValues.clear();
            contentValues.put("KEY", str);
            contentValues.put("NB", b(a(aVar).toString()));
            contentValues.put("LOC", b(a(aVar.a()).toString()));
            contentValues.put("TIME", String.valueOf(a.getTime()));
            if (this.a == null) {
                this.a = new c(this.c);
            }
            if (this.b == null || !this.b.isOpen()) {
                this.b = this.a.getWritableDatabase();
            }
            this.b.insert("MTLocationTable", null, contentValues);
            LogUtils.a("LocationDbManager addInfo success");
            d();
            return;
        }
        d();
    }

    public synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7a89795cbecaf9de2351e300182cc12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7a89795cbecaf9de2351e300182cc12");
            return;
        }
        if (this.a == null) {
            this.a = new c(this.c);
        }
        if (this.b == null || !this.b.isOpen()) {
            this.b = this.a.getWritableDatabase();
        }
        this.b.delete("MTLocationTable", "KEY = ?", new String[]{str});
        d();
    }

    public synchronized boolean a(ConcurrentHashMap<String, ArrayList<GearsLocator.a>> concurrentHashMap) {
        Cursor cursor;
        ArrayList<GearsLocator.a> arrayList;
        GearsLocator.a b;
        Object[] objArr = {concurrentHashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27c7fb52a8b38d726fe021703427f501", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27c7fb52a8b38d726fe021703427f501")).booleanValue();
        }
        if (concurrentHashMap == null) {
            LogUtils.a("LocationDbManager map is null");
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        Cursor cursor2 = null;
        try {
            try {
                cursor = c();
                if (cursor == null) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                            d();
                        } catch (Throwable unused) {
                        }
                    }
                    return false;
                }
                try {
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        String string = cursor.getString(1);
                        if (concurrentHashMap.containsKey(string)) {
                            arrayList = concurrentHashMap.get(string);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            b = b(new JSONObject(c(cursor.getString(2))));
                        } else {
                            concurrentHashMap.put(string, new ArrayList<>());
                            arrayList = concurrentHashMap.get(string);
                            b = b(new JSONObject(c(cursor.getString(2))));
                        }
                        arrayList.add(b);
                        cursor.moveToNext();
                    }
                    if (cursor != null) {
                        try {
                            cursor.close();
                            d();
                        } catch (Throwable unused2) {
                        }
                    }
                    return true;
                } catch (Exception e) {
                    e = e;
                    cursor2 = cursor;
                    LogUtils.a("LocationDbManager getInfo failed: " + e.getMessage());
                    if (cursor2 != null) {
                        try {
                            cursor2.close();
                            d();
                        } catch (Throwable unused3) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        try {
                            cursor.close();
                            d();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = cursor2;
        }
    }

    public synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4008a2e37d05e35b50a4706db8f36772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4008a2e37d05e35b50a4706db8f36772");
            return;
        }
        try {
            if (this.a == null) {
                this.a = new c(this.c);
            }
            if (this.b == null || !this.b.isOpen()) {
                this.b = this.a.getWritableDatabase();
            }
            this.b.execSQL("DELETE from MTLocationTable");
            d();
        } catch (Exception e) {
            LogUtils.a("LocationDbManager deleteAll exception : " + e.getMessage());
            d();
        }
    }

    public synchronized Cursor c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd6bf54ce7216131f0dccfd0c4ca28e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd6bf54ce7216131f0dccfd0c4ca28e8");
        }
        if (this.a == null) {
            this.a = new c(this.c);
        }
        if (this.b == null || !this.b.isOpen()) {
            this.b = this.a.getWritableDatabase();
        }
        return this.b.rawQuery("SELECT * FROM MTLocationTable", null);
    }

    public synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b58d076e22f6a30f10c41feeb50236c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b58d076e22f6a30f10c41feeb50236c5");
            return;
        }
        if (this.b != null && this.b.isOpen()) {
            this.b.close();
            LogUtils.a("LocationDbManager db closed");
        }
    }
}
