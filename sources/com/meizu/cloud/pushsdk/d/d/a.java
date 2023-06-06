package com.meizu.cloud.pushsdk.d.d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class a implements d {
    private static final String a = "a";
    private SQLiteDatabase b;
    private final b c;
    private final String[] d = {"id", "eventData", "dateCreated"};
    private long e = -1;
    private final int f;

    private List<Map<String, Object>> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (d()) {
            Cursor query = this.b.query("events", this.d, null, null, null, null, str2);
            query.moveToFirst();
            while (!query.isAfterLast()) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("id", Long.valueOf(query.getLong(0)));
                hashMap.put("eventData", a(query.getBlob(1)));
                hashMap.put("dateCreated", query.getString(2));
                query.moveToNext();
                arrayList.add(hashMap);
            }
            query.close();
        }
        return arrayList;
    }

    public static Map<String, String> a(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            HashMap hashMap = (HashMap) objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return hashMap;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] a(Map<String, String> map) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(map);
            objectOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean d() {
        return this.b != null && this.b.isOpen();
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public final boolean a() {
        return d();
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public final boolean a(long j) {
        int i;
        if (d()) {
            SQLiteDatabase sQLiteDatabase = this.b;
            i = sQLiteDatabase.delete("events", "id=" + j, null);
        } else {
            i = -1;
        }
        String str = a;
        com.meizu.cloud.pushsdk.d.f.c.b(str, "Removed event from database: " + j, new Object[0]);
        return i == 1;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public final long b() {
        if (d()) {
            return DatabaseUtils.queryNumEntries(this.b, "events");
        }
        return 0L;
    }

    public a(Context context, int i) {
        String str;
        String processName = MzSystemUtils.getProcessName(context);
        if (TextUtils.isEmpty(processName)) {
            str = "PushEvents.db";
        } else {
            str = processName + "_PushEvents.db";
        }
        this.c = b.a(context, str);
        if (!d()) {
            try {
                this.b = this.c.getWritableDatabase();
                this.b.enableWriteAheadLogging();
            } catch (Exception e) {
                com.meizu.cloud.pushsdk.d.f.c.a(a, " open database error " + e.getMessage(), new Object[0]);
            }
        }
        this.f = i;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public final void a(com.meizu.cloud.pushsdk.d.a.a aVar) {
        if (d()) {
            byte[] a2 = a(aVar.a());
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("eventData", a2);
            this.e = this.b.insert("events", null, contentValues);
        }
        String str = a;
        com.meizu.cloud.pushsdk.d.f.c.b(str, "Added event to database: " + this.e, new Object[0]);
        long j = this.e;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public final com.meizu.cloud.pushsdk.d.b.c c() {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        int i = this.f;
        for (Map<String, Object> map : a(null, "id ASC LIMIT " + i)) {
            com.meizu.cloud.pushsdk.d.a.c cVar = new com.meizu.cloud.pushsdk.d.a.c();
            cVar.a((Map) map.get("eventData"));
            linkedList.add((Long) map.get("id"));
            arrayList.add(cVar);
        }
        return new com.meizu.cloud.pushsdk.d.b.c(arrayList, linkedList);
    }
}
