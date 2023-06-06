package com.sankuai.waimai.platform.widget.dial.presenter;

import android.app.Dialog;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface DialContract {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface Presenter {

        /* compiled from: ProGuard */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes5.dex */
        public @interface DialScene {
        }

        void a(String str, String str2, String str3, int i);

        void a(String str, String str2, String str3, int i, a aVar);

        void a(String str, ArrayList<String> arrayList, String str2, int i);

        void a(String str, ArrayList<String> arrayList, String str2, int i, a aVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void a(boolean z);

        void a(boolean z, int i);

        void a(boolean z, boolean z2, int i);

        void b();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c<T extends Presenter> {

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public static abstract class a implements b {
            public abstract boolean a();
        }

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public interface b {
            boolean b();

            boolean c();
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.platform.widget.dial.presenter.DialContract$c$c  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static abstract class AbstractC1083c {
            public abstract boolean a(String str, Dialog dialog);

            public abstract boolean b(String str, Dialog dialog);
        }

        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public static abstract class d implements b {
            public abstract void a();
        }

        void a(String str);

        void a(String str, String str2, String str3, String str4, b bVar);

        void a(String str, String str2, String str3, String str4, AbstractC1083c abstractC1083c);

        void a(String str, String str2, String str3, String str4, d dVar);

        void a(String str, String str2, String str3, String str4, String str5, a aVar, String str6);

        void a(boolean z);

        void b(String str);
    }
}
