package com.sankuai.waimai.platform.capacity.log;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    String b;
    String c;
    String d;
    String e;
    String f;
    boolean g;
    boolean h;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f0344d7bf83fb7e308353b908e3be1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f0344d7bf83fb7e308353b908e3be1a");
        } else {
            this.d = "default";
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.capacity.log.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC1040a {
        public static ChangeQuickRedirect b;
        protected a c;

        public abstract String a();

        public AbstractC1040a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "093105f5426930775847b45ffe71a106", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "093105f5426930775847b45ffe71a106");
                return;
            }
            this.c = new a();
            this.c.c = a();
        }

        public final AbstractC1040a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec6c89a33a6be0ba0c92d0144b34de4", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1040a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec6c89a33a6be0ba0c92d0144b34de4");
            }
            this.c.b = str;
            return this;
        }

        public final AbstractC1040a b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c70a102ca267f15ef71f359cf54ac58", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1040a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c70a102ca267f15ef71f359cf54ac58");
            }
            this.c.d = str;
            return this;
        }

        public final AbstractC1040a c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d332203a54d10547c613c9c08c631082", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1040a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d332203a54d10547c613c9c08c631082");
            }
            this.c.e = str;
            return this;
        }

        public final AbstractC1040a d(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af672eb85ac5ec17d7b76fc1bfbd396a", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1040a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af672eb85ac5ec17d7b76fc1bfbd396a");
            }
            this.c.f = str;
            return this;
        }

        public final AbstractC1040a a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "508eee4a56cc7cee1c04f1b6f9f33428", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1040a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "508eee4a56cc7cee1c04f1b6f9f33428");
            }
            this.c.g = z;
            return this;
        }

        public final AbstractC1040a b(boolean z) {
            Object[] objArr = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecf359374d0cb61c5fde51848dbcb407", RobustBitConfig.DEFAULT_VALUE)) {
                return (AbstractC1040a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecf359374d0cb61c5fde51848dbcb407");
            }
            this.c.h = true;
            return this;
        }

        public final a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4907f0d60d4e44cece52d0c9bc28e05b", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4907f0d60d4e44cece52d0c9bc28e05b");
            }
            if (this.c == null || TextUtils.isEmpty(this.c.b)) {
                throw new IllegalArgumentException("Log module can not be null");
            }
            return this.c;
        }
    }
}
