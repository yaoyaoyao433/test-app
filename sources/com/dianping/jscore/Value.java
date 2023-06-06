package com.dianping.jscore;

import android.support.annotation.Keep;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Encoding;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes.dex */
public class Value {
    protected static final int TYPE_ARRAY = 5;
    protected static final int TYPE_BOOLEAN = 2;
    protected static final int TYPE_NULL = 0;
    protected static final int TYPE_NUMBER = 1;
    protected static final int TYPE_OBJECT = 4;
    protected static final int TYPE_STRING = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @Keep
    protected String[] functionNames;
    @Keep
    protected JavaScriptInterface[] functions;
    @Keep
    public int type;
    @Keep
    protected Unarchived unarchived;
    @Keep
    public String value;

    public Value() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75c8c31288689e3a5ccb1a5b0218a907", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75c8c31288689e3a5ccb1a5b0218a907");
            return;
        }
        this.functions = null;
        this.functionNames = null;
        this.value = "";
        this.type = 0;
    }

    public Value(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28fb09c5e297a8abc1fdb198407637fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28fb09c5e297a8abc1fdb198407637fb");
            return;
        }
        this.functions = null;
        this.functionNames = null;
        this.value = "";
        this.unarchived = new Unarchived((bArr == null || bArr.length == 0) ? new byte[]{78} : bArr);
    }

    public Value(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58108a0945b90dcacf3e2bbdd423978f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58108a0945b90dcacf3e2bbdd423978f");
            return;
        }
        this.functions = null;
        this.functionNames = null;
        this.value = "";
        this.value = String.valueOf(d);
        this.type = 1;
    }

    public Value(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "503ab2b5aa0349051b2c532384874728", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "503ab2b5aa0349051b2c532384874728");
            return;
        }
        this.functions = null;
        this.functionNames = null;
        this.value = "";
        this.value = String.valueOf(str);
        this.type = 3;
    }

    public Value(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8088b0becdc0453e17eabd5fc0a094ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8088b0becdc0453e17eabd5fc0a094ca");
            return;
        }
        this.functions = null;
        this.functionNames = null;
        this.value = "";
        this.type = z ? 4 : 3;
        this.value = str;
    }

    public Value(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d889bdf23bc4038f354d0fa62c721ace", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d889bdf23bc4038f354d0fa62c721ace");
            return;
        }
        this.functions = null;
        this.functionNames = null;
        this.value = "";
        this.value = String.valueOf(z);
        this.type = 2;
    }

    public Value(Encoding encoding) {
        Object[] objArr = {encoding};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f94013f89d8c21ba53f5d609110dbbde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f94013f89d8c21ba53f5d609110dbbde");
            return;
        }
        this.functions = null;
        this.functionNames = null;
        this.value = "";
        this.type = 4;
        this.value = encoding.encode().toString();
        this.functionNames = encoding.getFunctionNames();
        this.functions = encoding.getFunctions();
    }

    public Value(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "779c0da7c947ef52ac3a3eb981d7466b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "779c0da7c947ef52ac3a3eb981d7466b");
            return;
        }
        this.functions = null;
        this.functionNames = null;
        this.value = "";
        this.type = 4;
        this.value = jSONObject.toString();
    }

    public Value(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "701034966882cbe4e7d9e12cd601f61c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "701034966882cbe4e7d9e12cd601f61c");
            return;
        }
        this.functions = null;
        this.functionNames = null;
        this.value = "";
        this.type = 5;
        this.value = jSONArray.toString();
    }

    public Value(Encoding[] encodingArr) {
        Object[] objArr = {encodingArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6eb7646252a8e9586ea6d120ca2e6c10", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6eb7646252a8e9586ea6d120ca2e6c10");
            return;
        }
        this.functions = null;
        this.functionNames = null;
        this.value = "";
        this.type = 5;
        JSONArray jSONArray = new JSONArray();
        for (Encoding encoding : encodingArr) {
            jSONArray.put(encoding.encode());
        }
        this.value = jSONArray.toString();
    }

    public boolean bool() throws ArchiveException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "316fa17a60cdac82460c838470923362", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "316fa17a60cdac82460c838470923362")).booleanValue();
        }
        this.unarchived.rewind();
        return this.unarchived.readBoolean();
    }

    public String string() throws ArchiveException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20d6c2ff31697c863efe929ebf8cf0f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20d6c2ff31697c863efe929ebf8cf0f4");
        }
        this.unarchived.rewind();
        return this.unarchived.readString();
    }

    public Double number() throws ArchiveException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "baa198f8d4594b95986f18cedca58043", RobustBitConfig.DEFAULT_VALUE)) {
            return (Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "baa198f8d4594b95986f18cedca58043");
        }
        this.unarchived.rewind();
        return Double.valueOf(this.unarchived.readDouble());
    }

    public <T> T object(DecodingFactory<T> decodingFactory) throws ArchiveException {
        Object[] objArr = {decodingFactory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b1894792abca2f2c5616b0bd0c91a7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b1894792abca2f2c5616b0bd0c91a7f");
        }
        this.unarchived.rewind();
        return (T) this.unarchived.readObject(decodingFactory);
    }

    public <T> T[] array(DecodingFactory<T> decodingFactory) throws ArchiveException {
        Object[] objArr = {decodingFactory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b3cb87ca3efd84beab57c0e265cca83", RobustBitConfig.DEFAULT_VALUE)) {
            return (T[]) ((Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b3cb87ca3efd84beab57c0e265cca83"));
        }
        this.unarchived.rewind();
        return (T[]) this.unarchived.readArray(decodingFactory);
    }

    public boolean isBool() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f408468ec9e4450d4b507065accd523", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f408468ec9e4450d4b507065accd523")).booleanValue();
        }
        this.unarchived.rewind();
        return this.unarchived.peek() == 66;
    }

    public boolean isNULL() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d03da988109055632efc486ee4a09429", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d03da988109055632efc486ee4a09429")).booleanValue();
        }
        this.unarchived.rewind();
        return this.unarchived.peek() == 78;
    }

    public boolean isString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd2e8035bf4d0e9e0e73b8c6fc3e8021", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd2e8035bf4d0e9e0e73b8c6fc3e8021")).booleanValue();
        }
        this.unarchived.rewind();
        return this.unarchived.peek() == 83;
    }

    public boolean isNumber() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "475007b526b08b978ae180f79ef4a49e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "475007b526b08b978ae180f79ef4a49e")).booleanValue();
        }
        this.unarchived.rewind();
        return this.unarchived.peek() == 68;
    }

    public boolean isArray() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc9b180ae3f6bda75a2cf4185ba9489d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc9b180ae3f6bda75a2cf4185ba9489d")).booleanValue();
        }
        this.unarchived.rewind();
        return this.unarchived.peek() == 65;
    }

    public boolean isObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87b73cf0d72511279102ba6bc8222228", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87b73cf0d72511279102ba6bc8222228")).booleanValue();
        }
        this.unarchived.rewind();
        return this.unarchived.peek() == 79;
    }

    public double readDouble(int i) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9bcda946bc1cda8e5d1477b36718c7b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9bcda946bc1cda8e5d1477b36718c7b")).doubleValue();
        }
        if (!isObject()) {
            return -1.0d;
        }
        while (true) {
            int readMemberHash16 = this.unarchived.readMemberHash16();
            if (readMemberHash16 <= 0) {
                return -1.0d;
            }
            if (i == readMemberHash16) {
                return this.unarchived.readDouble();
            }
            this.unarchived.skipAny();
        }
    }

    public String readString(int i) throws ArchiveException {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6386b90be5c3f48874d7a2782c851982", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6386b90be5c3f48874d7a2782c851982");
        }
        this.unarchived.rewind();
        while (true) {
            int readMemberHash16 = this.unarchived.readMemberHash16();
            if (readMemberHash16 <= 0) {
                return "";
            }
            if (i == readMemberHash16) {
                return this.unarchived.readString();
            }
            this.unarchived.skipAny();
        }
    }

    @Keep
    public Unarchived getUnarchived() {
        return this.unarchived;
    }

    @Keep
    public int getType() {
        return this.type;
    }

    @Keep
    public String getValue() {
        return this.value;
    }
}
