package com.meituan.android.common.locate.controller;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class c {
    private static c a;
    public static ChangeQuickRedirect changeQuickRedirect;
    private b b;
    private SQLiteDatabase c;
    private Context d;

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d26e48e72107154df5e0208691723824", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d26e48e72107154df5e0208691723824");
        } else {
            this.d = context;
        }
    }

    public static c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8215987e6eb30c55f59ffef1f3a04759", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8215987e6eb30c55f59ffef1f3a04759");
        }
        if (a == null) {
            a = new c(context);
        }
        return a;
    }

    private Cursor b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "64c7fb28f27ab4909c811f0a323b1aeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "64c7fb28f27ab4909c811f0a323b1aeb");
        }
        try {
            if (this.b == null) {
                this.b = new b(this.d);
            }
            if (this.c == null || !this.c.isOpen()) {
                this.c = this.b.getWritableDatabase();
            }
            return this.c.rawQuery("SELECT * FROM MTAddressTable", null);
        } catch (Throwable th) {
            LogUtils.a(getClass(), th);
            return null;
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed43db123ec7e9a4956dff089246db9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed43db123ec7e9a4956dff089246db9c");
            return;
        }
        try {
            if (this.c == null || !this.c.isOpen()) {
                return;
            }
            this.c.close();
            LogUtils.a("GeohashDbManager db closed");
        } catch (Throwable th) {
            LogUtils.a(th);
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a89f88fff0a0b6c19cc00015e64e3c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a89f88fff0a0b6c19cc00015e64e3c2");
            return;
        }
        Cursor b = b();
        try {
            if (b == null) {
                return;
            }
            try {
                int count = b.getCount();
                if (count > 30) {
                    LogUtils.a("GeohashDbManager deleteInfo");
                    this.c.delete("MTAddressTable", "_id <= ?", new String[]{String.valueOf(count - 30)});
                }
            } catch (Exception e) {
                LogUtils.a("GeohashDbManager delete Geohash error: " + e.getMessage());
            }
        } finally {
            b.close();
            c();
        }
    }

    public void a(String str, com.meituan.android.common.locate.model.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eeb35ee33b8a1b67ac800a09759e9c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eeb35ee33b8a1b67ac800a09759e9c57");
        } else if (aVar == null) {
        } else {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.clear();
                contentValues.put("GEOHASH", str);
                contentValues.put("ADDRESS", aVar.b());
                contentValues.put("COUNTRY", aVar.c());
                contentValues.put("PROVINCE", aVar.d());
                contentValues.put("CITY", aVar.e());
                contentValues.put("DISTRICT", aVar.f());
                contentValues.put("DETAIL", aVar.g());
                contentValues.put("ADCODE", aVar.h());
                contentValues.put("CITYID_DP", Long.valueOf(aVar.j()));
                contentValues.put("CITYID_MT", Long.valueOf(aVar.i()));
                contentValues.put("TOWN_CODE", aVar.k());
                contentValues.put("TOWN_SHIP", aVar.l());
                contentValues.put("DP_NAME", aVar.m());
                contentValues.put("OPEN_CITY", aVar.n());
                if (this.b == null) {
                    this.b = new b(this.d);
                }
                if (this.c == null || !this.c.isOpen()) {
                    this.c = this.b.getWritableDatabase();
                }
                this.c.insert("MTAddressTable", null, contentValues);
                LogUtils.a("GeohashDbManager addInfo success");
            } catch (Throwable th) {
                try {
                    LogUtils.a("GeohashDbManager addInfo exception :" + th.getMessage());
                } finally {
                    c();
                }
            }
        }
    }

    public boolean a(Context context, Map<String, com.meituan.android.common.locate.model.a> map) {
        Object[] objArr = {context, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66628890a8175174fd89f22c5b1d0742", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66628890a8175174fd89f22c5b1d0742")).booleanValue();
        }
        if (map == null) {
            LogUtils.a("GeohashDbManager map is null");
            map = new HashMap<>();
        }
        Cursor b = b();
        try {
            if (b == null) {
                return false;
            }
            b.moveToFirst();
            while (!b.isAfterLast()) {
                String string = b.getString(b.getColumnIndex("GEOHASH"));
                if (map.get(string) == null) {
                    com.meituan.android.common.locate.model.a aVar = new com.meituan.android.common.locate.model.a();
                    aVar.a(b.getString(b.getColumnIndex("ADDRESS")));
                    aVar.b(b.getString(b.getColumnIndex("COUNTRY")));
                    aVar.c(b.getString(b.getColumnIndex("PROVINCE")));
                    aVar.d(b.getString(b.getColumnIndex("CITY")));
                    aVar.e(b.getString(b.getColumnIndex("DISTRICT")));
                    aVar.f(b.getString(b.getColumnIndex("DETAIL")));
                    aVar.g(b.getString(b.getColumnIndex("ADCODE")));
                    aVar.a(b.getLong(b.getColumnIndex("CITYID_MT")));
                    aVar.b(b.getLong(b.getColumnIndex("CITYID_DP")));
                    aVar.h(b.getString(b.getColumnIndex("TOWN_CODE")));
                    aVar.i(b.getString(b.getColumnIndex("TOWN_SHIP")));
                    aVar.j(b.getString(b.getColumnIndex("DP_NAME")));
                    aVar.k(b.getString(b.getColumnIndex("OPEN_CITY")));
                    LogUtils.a("GeohashDbManager addGeoHashs2Mem " + string + aVar.toString());
                    a.a(string, aVar);
                    map.put(string, aVar);
                }
                b.moveToNext();
            }
            LogUtils.a("GeohashDbManager  getGeohash success");
            return true;
        } catch (Exception e) {
            LogUtils.a("GeohashDbManager  getGeohash exception: " + e.getMessage());
            return false;
        } finally {
            b.close();
            c();
        }
    }
}
