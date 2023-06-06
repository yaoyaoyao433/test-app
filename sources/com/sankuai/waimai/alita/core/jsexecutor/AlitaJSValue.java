package com.sankuai.waimai.alita.core.jsexecutor;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AlitaJSValue {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Boolean bool;
    private List list;
    private Number number;
    private Map object;
    private String string;
    private Type type;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public enum Type {
        NUMBER,
        STRING,
        BOOLEAN,
        LIST,
        OBJECT,
        NULL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76548074b2911e1be78c504f23b5e90e", RobustBitConfig.DEFAULT_VALUE) ? (Type) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76548074b2911e1be78c504f23b5e90e") : (Type) Enum.valueOf(Type.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "970d59709144efc89f5cae1b0afeb283", RobustBitConfig.DEFAULT_VALUE) ? (Type[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "970d59709144efc89f5cae1b0afeb283") : (Type[]) values().clone();
        }

        Type() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e71060f7fc704b861464fd8a494d43dd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e71060f7fc704b861464fd8a494d43dd");
            }
        }
    }

    public static AlitaJSValue createValue(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50c3bc1c0f85985f3289170e7efa22e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaJSValue) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50c3bc1c0f85985f3289170e7efa22e3");
        }
        if (obj == null) {
            return createNull();
        }
        if (obj instanceof Number) {
            return new AlitaJSValue((Number) obj);
        }
        if (obj instanceof String) {
            return new AlitaJSValue((String) obj);
        }
        if (obj instanceof List) {
            return new AlitaJSValue((List) obj);
        }
        if (obj instanceof Map) {
            return new AlitaJSValue((Map) obj);
        }
        if (obj instanceof Boolean) {
            return new AlitaJSValue((Boolean) obj);
        }
        return createNull();
    }

    public static AlitaJSValue createNull() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6dee17e3548855fc91c67de8a4cc3d96", RobustBitConfig.DEFAULT_VALUE) ? (AlitaJSValue) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6dee17e3548855fc91c67de8a4cc3d96") : new AlitaJSValue();
    }

    public Type getType() {
        return this.type;
    }

    public Object getValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ba93923d4334978f71000a428abd86c", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ba93923d4334978f71000a428abd86c");
        }
        switch (this.type) {
            case NUMBER:
                return this.number;
            case STRING:
                return this.string;
            case BOOLEAN:
                return this.bool;
            case LIST:
                return this.list;
            case OBJECT:
                return this.object;
            default:
                return null;
        }
    }

    public AlitaJSValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e648443cc46fd5d0cda6170bc8f94307", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e648443cc46fd5d0cda6170bc8f94307");
            return;
        }
        this.type = Type.NULL;
        this.type = Type.NULL;
    }

    public AlitaJSValue(Number number) {
        Object[] objArr = {number};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "512d4b2ccc59766877d8544b357f51f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "512d4b2ccc59766877d8544b357f51f8");
            return;
        }
        this.type = Type.NULL;
        this.number = number;
        this.type = Type.NUMBER;
    }

    public AlitaJSValue(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81553a46c698fb15ebf5c647ebefdf89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81553a46c698fb15ebf5c647ebefdf89");
            return;
        }
        this.type = Type.NULL;
        this.string = str;
        this.type = Type.STRING;
    }

    public AlitaJSValue(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd0f8fa8aa8e56372c3cb2bffe8b921d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd0f8fa8aa8e56372c3cb2bffe8b921d");
            return;
        }
        this.type = Type.NULL;
        this.list = list;
        this.type = Type.LIST;
    }

    public AlitaJSValue(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "742c2e459c80783edadcd31faf55df78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "742c2e459c80783edadcd31faf55df78");
            return;
        }
        this.type = Type.NULL;
        this.object = map;
        this.type = Type.OBJECT;
    }

    public AlitaJSValue(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3336cc5e5dcc4d514df1b3f772aaad57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3336cc5e5dcc4d514df1b3f772aaad57");
            return;
        }
        this.type = Type.NULL;
        this.bool = bool;
        this.type = Type.BOOLEAN;
    }

    public Object nullValue() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "997d2726e9087478829e787c7add4325", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "997d2726e9087478829e787c7add4325");
        }
        if (this.type == Type.NULL) {
            return null;
        }
        throw new Exception("is not null value");
    }

    public Map objectValue() {
        if (this.type == Type.OBJECT) {
            return this.object;
        }
        return null;
    }

    public List listValue() {
        if (this.type == Type.LIST) {
            return this.list;
        }
        return null;
    }

    public Boolean boolValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc81f61fba822791ff226be234c2e068", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc81f61fba822791ff226be234c2e068");
        }
        if (this.type == Type.BOOLEAN) {
            return this.bool;
        }
        if (this.type == Type.NUMBER) {
            return Boolean.valueOf(this.number.intValue() == 1);
        }
        return null;
    }

    public Double doubleValue() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bf99a3b48748c223b64fb5335ac41f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bf99a3b48748c223b64fb5335ac41f1");
        }
        if (this.type == Type.NUMBER) {
            return Double.valueOf(this.number.doubleValue());
        }
        if (this.type == Type.STRING) {
            if (stringValue().length() == 0) {
                return Double.valueOf(0.0d);
            }
            try {
                return Double.valueOf(Double.parseDouble(this.string));
            } catch (Exception e) {
                throw new Exception("cannot covert string value to double", e);
            }
        }
        return null;
    }

    public Integer intValue() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd3d5c3d1edee1895a9f20cfd00526e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd3d5c3d1edee1895a9f20cfd00526e4");
        }
        if (this.type == Type.NUMBER) {
            return Integer.valueOf(this.number.intValue());
        }
        if (this.type == Type.STRING) {
            if (stringValue().length() == 0) {
                return 0;
            }
            try {
                return Integer.valueOf(Integer.parseInt(this.string));
            } catch (Exception e) {
                throw new Exception("cannot covert string value to int", e);
            }
        }
        return null;
    }

    public Long longValue() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f14ccfdb80804c784e989f47e89fb638", RobustBitConfig.DEFAULT_VALUE)) {
            return (Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f14ccfdb80804c784e989f47e89fb638");
        }
        if (this.type == Type.NUMBER) {
            return Long.valueOf(this.number.longValue());
        }
        if (this.type == Type.STRING) {
            if (stringValue().length() == 0) {
                return 0L;
            }
            try {
                return Long.valueOf(Long.parseLong(this.string));
            } catch (Exception e) {
                throw new Exception("cannot covert string value to int", e);
            }
        }
        return null;
    }

    public String stringValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4abf92cf379ff55ea9ead7a344e064e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4abf92cf379ff55ea9ead7a344e064e8");
        }
        if (this.type == Type.NUMBER) {
            return this.number.toString();
        }
        if (this.type == Type.STRING) {
            return this.string;
        }
        if (this.type == Type.BOOLEAN) {
            return this.bool.booleanValue() ? "true" : "false";
        }
        return null;
    }
}
