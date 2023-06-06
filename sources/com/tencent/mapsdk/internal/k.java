package com.tencent.mapsdk.internal;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k {
    private StringBuilder a;
    private int b;

    private void a(String str) {
        for (int i = 0; i < this.b; i++) {
            this.a.append('\t');
        }
        if (str != null) {
            StringBuilder sb = this.a;
            sb.append(str);
            sb.append(": ");
        }
    }

    public k(StringBuilder sb, int i) {
        this.b = 0;
        this.a = sb;
        this.b = i;
    }

    private k(StringBuilder sb) {
        this.b = 0;
        this.a = sb;
    }

    private k a(boolean z, String str) {
        a(str);
        StringBuilder sb = this.a;
        sb.append(z ? 'T' : 'F');
        sb.append('\n');
        return this;
    }

    private k a(boolean z, boolean z2) {
        this.a.append(z ? 'T' : 'F');
        if (z2) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    public final k a(byte b, String str) {
        a(str);
        StringBuilder sb = this.a;
        sb.append((int) b);
        sb.append('\n');
        return this;
    }

    public final k a(byte b, boolean z) {
        this.a.append((int) b);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    private k a(char c, String str) {
        a(str);
        StringBuilder sb = this.a;
        sb.append(c);
        sb.append('\n');
        return this;
    }

    private k a(char c, boolean z) {
        this.a.append(c);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    public final k a(short s, String str) {
        a(str);
        StringBuilder sb = this.a;
        sb.append((int) s);
        sb.append('\n');
        return this;
    }

    public final k a(short s, boolean z) {
        this.a.append((int) s);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    public final k a(int i, String str) {
        a(str);
        StringBuilder sb = this.a;
        sb.append(i);
        sb.append('\n');
        return this;
    }

    public final k a(int i, boolean z) {
        this.a.append(i);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    public final k a(long j, String str) {
        a(str);
        StringBuilder sb = this.a;
        sb.append(j);
        sb.append('\n');
        return this;
    }

    public final k a(long j, boolean z) {
        this.a.append(j);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    private k a(float f, String str) {
        a(str);
        StringBuilder sb = this.a;
        sb.append(f);
        sb.append('\n');
        return this;
    }

    private k a(float f, boolean z) {
        this.a.append(f);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    private k a(double d, String str) {
        a(str);
        StringBuilder sb = this.a;
        sb.append(d);
        sb.append('\n');
        return this;
    }

    private k a(double d, boolean z) {
        this.a.append(d);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    public final k a(String str, String str2) {
        a(str2);
        if (str == null) {
            this.a.append("null\n");
        } else {
            StringBuilder sb = this.a;
            sb.append(str);
            sb.append('\n');
        }
        return this;
    }

    public final k a(String str, boolean z) {
        if (str == null) {
            this.a.append(StringUtil.NULL);
        } else {
            this.a.append(str);
        }
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    public final k a(byte[] bArr, String str) {
        a(str);
        if (bArr == null) {
            this.a.append("null\n");
            return this;
        } else if (bArr.length == 0) {
            StringBuilder sb = this.a;
            sb.append(bArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.a;
            sb2.append(bArr.length);
            sb2.append(", [\n");
            k kVar = new k(this.a, this.b + 1);
            for (byte b : bArr) {
                kVar.a(b, (String) null);
            }
            a(']', (String) null);
            return this;
        }
    }

    public final k a(byte[] bArr, boolean z) {
        if (bArr == null || bArr.length == 0) {
            if (z) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            return this;
        }
        this.a.append(i.a(bArr));
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    private k a(char[] cArr, String str) {
        a(str);
        if (cArr == null) {
            this.a.append("null\n");
            return this;
        } else if (cArr.length == 0) {
            StringBuilder sb = this.a;
            sb.append(cArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.a;
            sb2.append(cArr.length);
            sb2.append(", [\n");
            k kVar = new k(this.a, this.b + 1);
            for (char c : cArr) {
                kVar.a(c, (String) null);
            }
            a(']', (String) null);
            return this;
        }
    }

    private k a(char[] cArr, boolean z) {
        if (cArr == null || cArr.length == 0) {
            if (z) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            return this;
        }
        this.a.append(new String(cArr));
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    private k a(short[] sArr, String str) {
        a(str);
        if (sArr == null) {
            this.a.append("null\n");
            return this;
        } else if (sArr.length == 0) {
            StringBuilder sb = this.a;
            sb.append(sArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.a;
            sb2.append(sArr.length);
            sb2.append(", [\n");
            k kVar = new k(this.a, this.b + 1);
            for (short s : sArr) {
                kVar.a(s, (String) null);
            }
            a(']', (String) null);
            return this;
        }
    }

    private k a(short[] sArr, boolean z) {
        if (sArr == null || sArr.length == 0) {
            this.a.append("[]");
            if (z) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            return this;
        }
        this.a.append("[");
        k kVar = new k(this.a, this.b + 1);
        for (int i = 0; i < sArr.length; i++) {
            short s = sArr[i];
            if (i != 0) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            kVar.a(s, false);
        }
        this.a.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    private k a(int[] iArr, String str) {
        a(str);
        if (iArr == null) {
            this.a.append("null\n");
            return this;
        } else if (iArr.length == 0) {
            StringBuilder sb = this.a;
            sb.append(iArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.a;
            sb2.append(iArr.length);
            sb2.append(", [\n");
            k kVar = new k(this.a, this.b + 1);
            for (int i : iArr) {
                kVar.a(i, (String) null);
            }
            a(']', (String) null);
            return this;
        }
    }

    private k a(int[] iArr, boolean z) {
        if (iArr == null || iArr.length == 0) {
            this.a.append("[]");
            if (z) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            return this;
        }
        this.a.append("[");
        k kVar = new k(this.a, this.b + 1);
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i != 0) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            kVar.a(i2, false);
        }
        this.a.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    private k a(long[] jArr, String str) {
        a(str);
        if (jArr == null) {
            this.a.append("null\n");
            return this;
        } else if (jArr.length == 0) {
            StringBuilder sb = this.a;
            sb.append(jArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.a;
            sb2.append(jArr.length);
            sb2.append(", [\n");
            k kVar = new k(this.a, this.b + 1);
            for (long j : jArr) {
                kVar.a(j, (String) null);
            }
            a(']', (String) null);
            return this;
        }
    }

    private k a(long[] jArr, boolean z) {
        if (jArr == null || jArr.length == 0) {
            this.a.append("[]");
            if (z) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            return this;
        }
        this.a.append("[");
        k kVar = new k(this.a, this.b + 1);
        for (int i = 0; i < jArr.length; i++) {
            long j = jArr[i];
            if (i != 0) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            kVar.a(j, false);
        }
        this.a.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    private k a(float[] fArr, String str) {
        a(str);
        if (fArr == null) {
            this.a.append("null\n");
            return this;
        } else if (fArr.length == 0) {
            StringBuilder sb = this.a;
            sb.append(fArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.a;
            sb2.append(fArr.length);
            sb2.append(", [\n");
            k kVar = new k(this.a, this.b + 1);
            for (float f : fArr) {
                kVar.a(f, (String) null);
            }
            a(']', (String) null);
            return this;
        }
    }

    private k a(float[] fArr, boolean z) {
        if (fArr == null || fArr.length == 0) {
            this.a.append("[]");
            if (z) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            return this;
        }
        this.a.append("[");
        k kVar = new k(this.a, this.b + 1);
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            if (i != 0) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            kVar.a(f, false);
        }
        this.a.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    private k a(double[] dArr, String str) {
        a(str);
        if (dArr == null) {
            this.a.append("null\n");
            return this;
        } else if (dArr.length == 0) {
            StringBuilder sb = this.a;
            sb.append(dArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.a;
            sb2.append(dArr.length);
            sb2.append(", [\n");
            k kVar = new k(this.a, this.b + 1);
            for (double d : dArr) {
                kVar.a(d, (String) null);
            }
            a(']', (String) null);
            return this;
        }
    }

    private k a(double[] dArr, boolean z) {
        if (dArr == null || dArr.length == 0) {
            this.a.append("[]");
            if (z) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            return this;
        }
        this.a.append("[");
        k kVar = new k(this.a, this.b + 1);
        for (int i = 0; i < dArr.length; i++) {
            double d = dArr[i];
            if (i != 0) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            kVar.a(d, false);
        }
        this.a.append("[");
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    public final <K, V> k a(Map<K, V> map, String str) {
        a(str);
        if (map == null) {
            this.a.append("null\n");
            return this;
        } else if (map.isEmpty()) {
            StringBuilder sb = this.a;
            sb.append(map.size());
            sb.append(", {}\n");
            return this;
        } else {
            StringBuilder sb2 = this.a;
            sb2.append(map.size());
            sb2.append(", {\n");
            k kVar = new k(this.a, this.b + 1);
            k kVar2 = new k(this.a, this.b + 2);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                kVar.a('(', (String) null);
                kVar2.a((k) entry.getKey(), (String) null);
                kVar2.a((k) entry.getValue(), (String) null);
                kVar.a(')', (String) null);
            }
            a('}', (String) null);
            return this;
        }
    }

    private <K, V> k a(Map<K, V> map, boolean z) {
        if (map == null || map.isEmpty()) {
            this.a.append("{}");
            if (z) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            return this;
        }
        this.a.append(CommonConstant.Symbol.BIG_BRACKET_LEFT);
        k kVar = new k(this.a, this.b + 2);
        boolean z2 = true;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!z2) {
                this.a.append(CommonConstant.Symbol.COMMA);
            }
            kVar.a((k) entry.getKey(), true);
            kVar.a((k) entry.getValue(), false);
            z2 = false;
        }
        this.a.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    private <T> k a(T[] tArr, String str) {
        a(str);
        if (tArr == null) {
            this.a.append("null\n");
            return this;
        } else if (tArr.length == 0) {
            StringBuilder sb = this.a;
            sb.append(tArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.a;
            sb2.append(tArr.length);
            sb2.append(", [\n");
            k kVar = new k(this.a, this.b + 1);
            for (T t : tArr) {
                kVar.a((k) t, (String) null);
            }
            a(']', (String) null);
            return this;
        }
    }

    private <T> k a(T[] tArr, boolean z) {
        if (tArr == null || tArr.length == 0) {
            this.a.append("[]");
            if (z) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            return this;
        }
        this.a.append("[");
        k kVar = new k(this.a, this.b + 1);
        for (int i = 0; i < tArr.length; i++) {
            T t = tArr[i];
            if (i != 0) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            kVar.a((k) t, false);
        }
        this.a.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> k a(Collection<T> collection, String str) {
        if (collection == null) {
            a(str);
            this.a.append("null\t");
            return this;
        }
        return a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> k a(Collection<T> collection, boolean z) {
        if (collection == null) {
            this.a.append("[]");
            if (z) {
                this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            }
            return this;
        }
        return a(collection.toArray(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> k a(T t, String str) {
        if (t == null) {
            this.a.append("null\n");
        } else if (t instanceof Byte) {
            a(((Byte) t).byteValue(), str);
        } else if (t instanceof Boolean) {
            a(((Boolean) t).booleanValue(), str);
        } else if (t instanceof Short) {
            a(((Short) t).shortValue(), str);
        } else if (t instanceof Integer) {
            a(((Integer) t).intValue(), str);
        } else if (t instanceof Long) {
            a(((Long) t).longValue(), str);
        } else if (t instanceof Float) {
            a(((Float) t).floatValue(), str);
        } else if (t instanceof Double) {
            a(((Double) t).doubleValue(), str);
        } else if (t instanceof String) {
            a((String) t, str);
        } else if (t instanceof Map) {
            a((Map) t, str);
        } else if (t instanceof List) {
            a((Collection) ((List) t), str);
        } else if (t instanceof p) {
            a((p) t, str);
        } else if (t instanceof byte[]) {
            a((byte[]) t, str);
        } else if (t instanceof boolean[]) {
            a((k) ((boolean[]) t), str);
        } else if (t instanceof short[]) {
            a((short[]) t, str);
        } else if (t instanceof int[]) {
            a((int[]) t, str);
        } else if (t instanceof long[]) {
            a((long[]) t, str);
        } else if (t instanceof float[]) {
            a((float[]) t, str);
        } else if (t instanceof double[]) {
            a((double[]) t, str);
        } else if (t.getClass().isArray()) {
            a((Object[]) t, str);
        } else {
            throw new l("write object error: unsupport type.");
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> k a(T t, boolean z) {
        if (t == null) {
            this.a.append("null\n");
        } else if (t instanceof Byte) {
            a(((Byte) t).byteValue(), z);
        } else if (t instanceof Boolean) {
            a(((Boolean) t).booleanValue(), z);
        } else if (t instanceof Short) {
            a(((Short) t).shortValue(), z);
        } else if (t instanceof Integer) {
            a(((Integer) t).intValue(), z);
        } else if (t instanceof Long) {
            a(((Long) t).longValue(), z);
        } else if (t instanceof Float) {
            a(((Float) t).floatValue(), z);
        } else if (t instanceof Double) {
            a(((Double) t).doubleValue(), z);
        } else if (t instanceof String) {
            a((String) t, z);
        } else if (t instanceof Map) {
            a((Map) t, z);
        } else if (t instanceof List) {
            a((Collection) ((List) t), z);
        } else if (t instanceof p) {
            a((p) t, z);
        } else if (t instanceof byte[]) {
            a((byte[]) t, z);
        } else if (t instanceof boolean[]) {
            a((k) ((boolean[]) t), z);
        } else if (t instanceof short[]) {
            a((short[]) t, z);
        } else if (t instanceof int[]) {
            a((int[]) t, z);
        } else if (t instanceof long[]) {
            a((long[]) t, z);
        } else if (t instanceof float[]) {
            a((float[]) t, z);
        } else if (t instanceof double[]) {
            a((double[]) t, z);
        } else if (t.getClass().isArray()) {
            a((Object[]) t, z);
        } else {
            throw new l("write object error: unsupport type.");
        }
        return this;
    }

    public final k a(p pVar, String str) {
        a('{', str);
        if (pVar == null) {
            StringBuilder sb = this.a;
            sb.append('\t');
            sb.append(StringUtil.NULL);
        } else {
            pVar.display(this.a, this.b + 1);
        }
        a('}', (String) null);
        return this;
    }

    public final k a(p pVar, boolean z) {
        this.a.append(CommonConstant.Symbol.BIG_BRACKET_LEFT);
        if (pVar == null) {
            StringBuilder sb = this.a;
            sb.append('\t');
            sb.append(StringUtil.NULL);
        } else {
            pVar.displaySimple(this.a, this.b + 1);
        }
        this.a.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        if (z) {
            this.a.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        }
        return this;
    }
}
