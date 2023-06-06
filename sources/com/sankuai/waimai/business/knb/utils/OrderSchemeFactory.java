package com.sankuai.waimai.business.knb.utils;

import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class OrderSchemeFactory {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ String a(a aVar) {
        String json;
        String str;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72bc8c24b46926ba5078c4fc098c1096", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72bc8c24b46926ba5078c4fc098c1096");
        }
        if (aVar.i) {
            json = new GsonBuilder().registerTypeAdapter(a.class, new CrossOrderAdaptor()).create().toJson(aVar);
        } else {
            json = new GsonBuilder().registerTypeAdapter(a.class, new SingleOrderAdaptor()).create().toJson(aVar);
        }
        if (TextUtils.isEmpty(json)) {
            return json;
        }
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str = "imeituan://www.meituan.com";
        } else {
            str = com.sankuai.waimai.foundation.core.a.f() ? "dianping://waimai.dianping.com" : com.sankuai.waimai.foundation.router.interfaces.b.c;
        }
        return str + "/confirm/order?data=" + json + "&is_cross=" + aVar.i;
    }

    public static a a(long j, String str, boolean z) {
        Object[] objArr = {new Long(j), str, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7b016dad66f1072c4d9472faa3cfc789", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7b016dad66f1072c4d9472faa3cfc789") : new a(j, str, false);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        protected long b;
        protected String c;
        protected String d;
        protected int e;
        protected String f;
        protected String g;
        protected int h;
        protected boolean i;
        protected String j;
        protected int k;
        protected int l;
        protected int m;

        public a(long j, boolean z) {
            Object[] objArr = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e958ef160f3431b89719008e42344962", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e958ef160f3431b89719008e42344962");
                return;
            }
            this.b = 0L;
            this.c = "";
            this.d = "";
            this.e = 0;
            this.f = "";
            this.g = "";
            this.h = 0;
            this.i = false;
            this.k = -1;
            this.l = 15;
            this.m = Integer.MIN_VALUE;
            this.b = j;
            this.i = z;
        }

        public a(long j, String str, boolean z) {
            Object[] objArr = {new Long(j), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4c9a73e23f93697111c3975ee6a06aa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4c9a73e23f93697111c3975ee6a06aa");
                return;
            }
            this.b = 0L;
            this.c = "";
            this.d = "";
            this.e = 0;
            this.f = "";
            this.g = "";
            this.h = 0;
            this.i = false;
            this.k = -1;
            this.l = 15;
            this.m = Integer.MIN_VALUE;
            this.b = j;
            this.c = str;
            this.i = z;
        }

        public final a a(String str) {
            this.d = str;
            return this;
        }

        public final a a(int i) {
            this.e = i;
            return this;
        }

        public final a b(int i) {
            this.l = i;
            return this;
        }

        public final a c(int i) {
            this.m = i;
            return this;
        }

        public final a b(String str) {
            this.f = str;
            return this;
        }

        public final a c(String str) {
            this.g = str;
            return this;
        }

        public final a d(int i) {
            this.h = 0;
            return this;
        }

        public final a d(String str) {
            this.j = str;
            return this;
        }

        public final a e(int i) {
            this.k = i;
            return this;
        }

        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3e7785666ece1b6ee507425e8a9eefb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3e7785666ece1b6ee507425e8a9eefb") : OrderSchemeFactory.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class CrossOrderAdaptor extends TypeAdapter<a> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ a read(JsonReader jsonReader) throws IOException {
            return null;
        }

        public CrossOrderAdaptor() {
        }

        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ void write(JsonWriter jsonWriter, a aVar) throws IOException {
            a aVar2 = aVar;
            Object[] objArr = {jsonWriter, aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3449666863b4ab2c823585cf484628", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3449666863b4ab2c823585cf484628");
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("page_from").value(aVar2.j);
            jsonWriter.name("orders").jsonValue(aVar2.d);
            jsonWriter.name(PackageLoadReporter.LoadType.LOCAL);
            jsonWriter.beginObject();
            jsonWriter.name("tag").value(aVar2.g);
            jsonWriter.name(OtherVerifyTypeConstants.REQUEST_CODE).value(aVar2.h);
            jsonWriter.endObject();
            jsonWriter.endObject();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SingleOrderAdaptor extends TypeAdapter<a> {
        public static ChangeQuickRedirect a;

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ a read(JsonReader jsonReader) throws IOException {
            return null;
        }

        public SingleOrderAdaptor() {
        }

        @Override // com.google.gson.TypeAdapter
        public /* synthetic */ void write(JsonWriter jsonWriter, a aVar) throws IOException {
            a aVar2 = aVar;
            Object[] objArr = {jsonWriter, aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "137e97d53e598d6fd52c3db079b600f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "137e97d53e598d6fd52c3db079b600f0");
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("poi_id").value(aVar2.b);
            jsonWriter.name(FoodDetailNetWorkPreLoader.URI_POI_STR).value(aVar2.c);
            jsonWriter.name("business_type").value(aVar2.e);
            jsonWriter.name("page_from").value(aVar2.j);
            jsonWriter.name("source_type").value(aVar2.l);
            if (aVar2.m != Integer.MIN_VALUE) {
                jsonWriter.name("sub_biz_type").value(aVar2.m);
            }
            jsonWriter.name("transfer");
            jsonWriter.beginObject();
            jsonWriter.name("food_list").jsonValue(aVar2.d);
            jsonWriter.endObject();
            jsonWriter.name(PackageLoadReporter.LoadType.LOCAL);
            jsonWriter.beginObject();
            jsonWriter.name("tag").value(aVar2.g);
            if (aVar2.k != -1) {
                jsonWriter.name(KnbConstants.PARAMS_SCENE).value(aVar2.k);
            }
            if (!TextUtils.isEmpty(aVar2.f)) {
                jsonWriter.name("common_param").jsonValue(aVar2.f);
            }
            jsonWriter.endObject();
            jsonWriter.endObject();
        }
    }
}
