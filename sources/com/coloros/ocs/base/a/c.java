package com.coloros.ocs.base.a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class c {
    public static a a(Object obj) {
        return new a(obj);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* loaded from: classes.dex */
    public static final class a {
        private Object a;
        private List<String> b;

        public a(Object obj) {
            if (obj != null) {
                this.a = obj;
                this.b = new ArrayList();
                return;
            }
            throw new NullPointerException("null reference");
        }

        public final a a(String str, Object obj) {
            List<String> list = this.b;
            String str2 = str + "=" + obj;
            if (!TextUtils.isEmpty(str2)) {
                list.add(str2);
                return this;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.a.getClass().getSimpleName());
            sb.append('{');
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.b.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }
}
