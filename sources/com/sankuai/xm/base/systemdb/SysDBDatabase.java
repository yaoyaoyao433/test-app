package com.sankuai.xm.base.systemdb;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.c;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SysDBDatabase implements c {
    public static ChangeQuickRedirect a;
    SQLiteDatabase b;

    public final c a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "261b25e54b0baf11fe0dcd08444f60fb", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "261b25e54b0baf11fe0dcd08444f60fb");
        }
        try {
            this.b = SQLiteDatabase.openDatabase(str2, null, 0);
            return this;
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff3b11f245fbee0e89785c55290ea237", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff3b11f245fbee0e89785c55290ea237");
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.close();
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "282a3e8eb92c9c2610e97e0734837d54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "282a3e8eb92c9c2610e97e0734837d54");
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.beginTransaction();
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4fd0dc5362ae0b6195a84676b29be68", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4fd0dc5362ae0b6195a84676b29be68");
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.endTransaction();
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40ce6b2760e78ca016ffc3c1a2867609", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40ce6b2760e78ca016ffc3c1a2867609");
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.setTransactionSuccessful();
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e181f406e30cfa3142f0ac3231b5906", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e181f406e30cfa3142f0ac3231b5906")).booleanValue();
        }
        try {
            if (this.b == null) {
                return false;
            }
            return this.b.inTransaction();
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Object[] objArr = {str, null, str2, strArr2, null, null, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3370ade86ade04b63c8cf442bb33b3e9", 6917529027641081856L)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3370ade86ade04b63c8cf442bb33b3e9");
        }
        try {
            if (this.b == null) {
                return null;
            }
            return this.b.query(str, null, str2, strArr2, null, null, str5);
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {str, strArr, str2, strArr2, null, null, str5, str6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad79d48972748af575e587e29377f32", 6917529027641081856L)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad79d48972748af575e587e29377f32");
        }
        try {
            if (this.b == null) {
                return null;
            }
            return this.b.query(str, strArr, str2, strArr2, null, null, str5, str6);
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final Cursor a(String str, String[] strArr) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb1c547525e9e70c7ff13567e92c0a99", 6917529027641081856L)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb1c547525e9e70c7ff13567e92c0a99");
        }
        try {
            if (this.b == null) {
                return null;
            }
            return this.b.rawQuery(str, null);
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final int a(String str, String str2, String[] strArr) {
        Object[] objArr = {str, str2, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22bd618ad39258f210417c5c70ac8561", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22bd618ad39258f210417c5c70ac8561")).intValue();
        }
        try {
            if (this.b == null) {
                return -1;
            }
            return this.b.delete(str, str2, strArr);
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        Object[] objArr = {str, contentValues, str2, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60222ae6d0b7ec762c00576cefcf46bd", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60222ae6d0b7ec762c00576cefcf46bd")).intValue();
        }
        try {
            if (this.b == null) {
                return -1;
            }
            return this.b.update(str, contentValues, str2, strArr);
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7697366b438e74d4ff702c2d48da0a46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7697366b438e74d4ff702c2d48da0a46");
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.execSQL(str);
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30697c97bb64dd57448c17e738689bba", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30697c97bb64dd57448c17e738689bba")).booleanValue();
        }
        try {
            if (this.b == null) {
                return false;
            }
            return this.b.isOpen();
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "473945351bed275b8c42ef86b7eb13a2", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "473945351bed275b8c42ef86b7eb13a2");
        }
        try {
            return this.b == null ? "" : this.b.getPath();
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba98a2ffe8a41dd945b604da965d403b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba98a2ffe8a41dd945b604da965d403b");
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.beginTransactionNonExclusive();
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c11a51157936c46ca27297d0562d7c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c11a51157936c46ca27297d0562d7c")).booleanValue();
        }
        try {
            if (this.b == null) {
                return false;
            }
            return this.b.enableWriteAheadLogging();
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b4f2e63ad7067b4e037aaac969b9fa2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b4f2e63ad7067b4e037aaac969b9fa2");
            return;
        }
        try {
            if (this.b == null) {
                return;
            }
            this.b.disableWriteAheadLogging();
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }

    @Override // com.sankuai.xm.base.db.c
    public final long a(String str, String str2, ContentValues contentValues, int i) {
        Object[] objArr = {str, null, contentValues, 5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6c606df5cab1a62d54dc014568c2f44", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6c606df5cab1a62d54dc014568c2f44")).longValue();
        }
        try {
            if (this.b == null) {
                return -1L;
            }
            return this.b.insertWithOnConflict(str, null, contentValues, 5);
        } catch (RuntimeException e) {
            throw SysDBOpenHelper.a(e);
        }
    }
}
