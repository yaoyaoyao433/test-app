package com.sankuai.waimai.ugc.creator.ability.album.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.widget.media.utils.SelectPhotoUtil;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.entity.inner.MediaData;
import com.sankuai.waimai.ugc.creator.entity.inner.VideoData;
import com.sankuai.waimai.ugc.creator.manager.i;
import com.sankuai.waimai.ugc.creator.utils.f;
import com.sankuai.waimai.ugc.creator.utils.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final List<VideoData> b;
    final List<ImageData> c;
    public final List<com.sankuai.waimai.ugc.creator.entity.inner.a> d;
    public int e;
    long f;
    long g;
    public InterfaceC1360a h;
    final Context i;
    private b j;
    private b k;
    private com.sankuai.waimai.ugc.creator.utils.task.a<List<com.sankuai.waimai.ugc.creator.entity.inner.a>> l;
    private int m;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ugc.creator.ability.album.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1360a {
        void a(int i, List<com.sankuai.waimai.ugc.creator.entity.inner.a> list);
    }

    public static /* synthetic */ void a(a aVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d99176e31f59b4bf66889ebc89379181", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d99176e31f59b4bf66889ebc89379181");
            return;
        }
        aVar.c.addAll(list);
        aVar.f();
    }

    public static /* synthetic */ void b(a aVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "65f7075669f76cada56dcc8297d0b1f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "65f7075669f76cada56dcc8297d0b1f1");
            return;
        }
        aVar.b.addAll(list);
        aVar.f();
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d9c55974bc8e302abe5e633311d1e9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d9c55974bc8e302abe5e633311d1e9d");
            return;
        }
        this.f = PayTask.j;
        this.g = LocationStrategy.LOCATION_TIMEOUT;
        this.m = 0;
        this.i = context;
        this.c = new ArrayList();
        this.b = new ArrayList();
        this.d = new ArrayList();
    }

    public final a a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b682d2465439b50872760712fd548498", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b682d2465439b50872760712fd548498");
        }
        this.f = j;
        this.g = j2;
        return this;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57d40b8950d10de97bbe8c0765441f43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57d40b8950d10de97bbe8c0765441f43");
            return;
        }
        c();
        if (this.e == 0 || this.e == 1) {
            d();
        }
        if (this.e == 0 || this.e == 2) {
            e();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72fd54564f6c6ed286189b2fc17961a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72fd54564f6c6ed286189b2fc17961a9");
            return;
        }
        this.m++;
        this.k = new b<ImageData>() { // from class: com.sankuai.waimai.ugc.creator.ability.album.utils.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.utils.task.a
            public final /* synthetic */ Object b() throws Exception {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be41f1ee16a2e57555646ff4d3a5a1d2", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be41f1ee16a2e57555646ff4d3a5a1d2");
                }
                this.d = a.a(a.this.i, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                return a.a(this.d, false);
            }

            @Override // com.sankuai.waimai.ugc.creator.ability.album.utils.a.b, com.sankuai.waimai.ugc.creator.utils.task.a
            public final void a(List<ImageData> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53de1e2fced345a6cacf519e0033c87c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53de1e2fced345a6cacf519e0033c87c");
                    return;
                }
                super.a((List) list);
                a.a(a.this, list);
            }

            @Override // com.sankuai.waimai.ugc.creator.ability.album.utils.a.b, com.sankuai.waimai.ugc.creator.utils.task.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "122c2165cfb594c3c2c9695ee43d8a47", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "122c2165cfb594c3c2c9695ee43d8a47");
                    return;
                }
                super.a();
                a.a(a.this, new ArrayList());
            }
        };
        com.sankuai.waimai.ugc.creator.utils.task.b.a((com.sankuai.waimai.ugc.creator.utils.task.a) this.k);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a147f092a2225b6d3c33cd1cef99897d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a147f092a2225b6d3c33cd1cef99897d");
            return;
        }
        this.m++;
        this.j = new b<VideoData>() { // from class: com.sankuai.waimai.ugc.creator.ability.album.utils.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.utils.task.a
            public final /* synthetic */ Object b() throws Exception {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41d6d134d0bcdf0bead72b88a39d320f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41d6d134d0bcdf0bead72b88a39d320f");
                }
                ArrayList arrayList = new ArrayList();
                Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                String[] strArr = {"_id", "_data", "duration", "_size", "width", "height", "mime_type", "date_added", "bucket_id", "bucket_display_name"};
                String str = "duration>=" + a.this.f + " AND duration<=" + a.this.g + " AND mime_type=='video/mp4'";
                t createContentResolver = Privacy.createContentResolver(a.this.i, i.a().c().v);
                if (createContentResolver != null) {
                    this.d = createContentResolver.a(uri, strArr, str, null, "date_added DESC ");
                }
                if (this.d != null) {
                    while (this.d.moveToNext()) {
                        String string = this.d.getString(this.d.getColumnIndex("_data"));
                        arrayList.add(new VideoData(string, string, this.d.getInt(this.d.getColumnIndex("_size")), this.d.getInt(this.d.getColumnIndex("width")), this.d.getInt(this.d.getColumnIndex("height")), this.d.getString(this.d.getColumnIndex("bucket_id")), this.d.getString(this.d.getColumnIndex("bucket_display_name")), this.d.getLong(this.d.getColumnIndex("date_added")), this.d.getLong(this.d.getColumnIndex("duration")), o.b(string)));
                    }
                }
                return arrayList;
            }

            @Override // com.sankuai.waimai.ugc.creator.ability.album.utils.a.b, com.sankuai.waimai.ugc.creator.utils.task.a
            public final void a(List<VideoData> list) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b93b97f4204cac41324e71e036d54d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b93b97f4204cac41324e71e036d54d1");
                    return;
                }
                super.a((List) list);
                a.b(a.this, list);
            }

            @Override // com.sankuai.waimai.ugc.creator.ability.album.utils.a.b, com.sankuai.waimai.ugc.creator.utils.task.a
            public final void a(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7ef69d2dd040060852706a0c9d7a5f35", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7ef69d2dd040060852706a0c9d7a5f35");
                    return;
                }
                super.a(th);
                a.b(a.this, new ArrayList());
            }
        };
        com.sankuai.waimai.ugc.creator.utils.task.b.a((com.sankuai.waimai.ugc.creator.utils.task.a) this.j);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e06684136c680aaff1ced248bad6b11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e06684136c680aaff1ced248bad6b11");
            return;
        }
        this.m--;
        if (this.m == 0) {
            g();
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f11fa045c3a3e97db624434cafbcab06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f11fa045c3a3e97db624434cafbcab06");
        } else if (com.sankuai.waimai.foundation.utils.b.b(this.c) && com.sankuai.waimai.foundation.utils.b.b(this.b)) {
            a(new ArrayList());
        } else {
            this.l = new com.sankuai.waimai.ugc.creator.utils.task.a<List<com.sankuai.waimai.ugc.creator.entity.inner.a>>() { // from class: com.sankuai.waimai.ugc.creator.ability.album.utils.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.ugc.creator.utils.task.a
                public final /* synthetic */ void a(List<com.sankuai.waimai.ugc.creator.entity.inner.a> list) {
                    List<com.sankuai.waimai.ugc.creator.entity.inner.a> list2 = list;
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "700b0f86d47e9eb7b563092da0c770b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "700b0f86d47e9eb7b563092da0c770b8");
                        return;
                    }
                    a.this.d.addAll(list2);
                    a.this.a(list2);
                }

                @Override // com.sankuai.waimai.ugc.creator.utils.task.a
                public final /* synthetic */ List<com.sankuai.waimai.ugc.creator.entity.inner.a> b() throws Exception {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68051363f40cb46e94108339b5213bbf", RobustBitConfig.DEFAULT_VALUE)) {
                        return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68051363f40cb46e94108339b5213bbf");
                    }
                    ArrayList arrayList = new ArrayList();
                    com.sankuai.waimai.ugc.creator.entity.inner.a aVar = new com.sankuai.waimai.ugc.creator.entity.inner.a();
                    aVar.c = a.this.i.getString(R.string.wm_ugc_media_picker_all_video_image);
                    aVar.b = SelectPhotoUtil.ALL_ID;
                    arrayList.add(aVar);
                    if (a.this.e == 1) {
                        aVar.b(a.this.c);
                        return arrayList;
                    } else if (a.this.e == 2) {
                        aVar.a(a.this.b);
                        return arrayList;
                    } else {
                        com.sankuai.waimai.ugc.creator.entity.inner.a aVar2 = new com.sankuai.waimai.ugc.creator.entity.inner.a();
                        aVar2.c = a.this.i.getString(R.string.wm_ugc_media_picker_all_video);
                        aVar2.b = "ALL_VIDEOS";
                        aVar2.a(a.this.b);
                        com.sankuai.waimai.ugc.creator.entity.inner.a aVar3 = new com.sankuai.waimai.ugc.creator.entity.inner.a();
                        aVar3.c = a.this.i.getString(R.string.wm_ugc_media_picker_all_image);
                        aVar3.b = "ALL_IMAGES";
                        aVar3.b(a.this.c);
                        HashMap hashMap = new HashMap();
                        ArrayList<MediaData> arrayList2 = new ArrayList();
                        arrayList2.addAll(a.this.c);
                        arrayList2.addAll(a.this.b);
                        Collections.sort(arrayList2);
                        for (MediaData mediaData : arrayList2) {
                            String str = mediaData.o;
                            String str2 = mediaData.p;
                            com.sankuai.waimai.ugc.creator.entity.inner.a aVar4 = (com.sankuai.waimai.ugc.creator.entity.inner.a) hashMap.get(str);
                            if (aVar4 == null) {
                                aVar4 = new com.sankuai.waimai.ugc.creator.entity.inner.a();
                                aVar4.b = String.valueOf(str);
                                aVar4.c = str2;
                                hashMap.put(str, aVar4);
                            }
                            aVar4.a(mediaData);
                            aVar.a(mediaData);
                        }
                        arrayList.add(aVar3);
                        arrayList.add(aVar2);
                        arrayList.addAll(hashMap.values());
                        return arrayList;
                    }
                }

                @Override // com.sankuai.waimai.ugc.creator.utils.task.a
                public final void a(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "230e06da008802656a1d8f489c9bcd6c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "230e06da008802656a1d8f489c9bcd6c");
                    } else {
                        a.this.a(new ArrayList());
                    }
                }
            };
            com.sankuai.waimai.ugc.creator.utils.task.b.a((com.sankuai.waimai.ugc.creator.utils.task.a) this.l);
        }
    }

    void a(List<com.sankuai.waimai.ugc.creator.entity.inner.a> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c72da635ae230b5e87956737899f0c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c72da635ae230b5e87956737899f0c5");
        } else if (this.h != null) {
            this.h.a(this.e, list);
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a857d3579db81a6172e6a91c5bbe403d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a857d3579db81a6172e6a91c5bbe403d")).booleanValue() : com.sankuai.waimai.foundation.utils.b.b(this.d);
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0874b75e3023d73b1bddd67bb0634bdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0874b75e3023d73b1bddd67bb0634bdb");
            return;
        }
        this.c.clear();
        this.b.clear();
        this.d.clear();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27dd12ea4d2ff6cfa3b7059a34631562", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27dd12ea4d2ff6cfa3b7059a34631562");
            return;
        }
        if (this.k != null && !this.k.c()) {
            this.k.cancel();
            this.k = null;
        }
        if (this.j != null && !this.j.c()) {
            this.j.cancel();
            this.j = null;
        }
        if (this.l != null && !this.l.c()) {
            this.l.cancel();
            this.l = null;
        }
        this.m = 0;
        h();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class b<T> extends com.sankuai.waimai.ugc.creator.utils.task.a<List<T>> {
        public static ChangeQuickRedirect c;
        protected Cursor d;

        @Override // com.sankuai.waimai.ugc.creator.utils.task.a
        public /* bridge */ /* synthetic */ void a(Object obj) {
            a((List) ((List) obj));
        }

        public void a(List<T> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ddc0fdfe36404f39225a73c67fb6cae", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ddc0fdfe36404f39225a73c67fb6cae");
            } else {
                d();
            }
        }

        @Override // com.sankuai.waimai.ugc.creator.utils.task.a
        public void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce89306a03d463812014e22b69aa8a8b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce89306a03d463812014e22b69aa8a8b");
            } else {
                d();
            }
        }

        @Override // com.sankuai.waimai.ugc.creator.utils.task.a
        public void a(Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bebf8fe27b9a090d3b3f57bc1cd3bf1a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bebf8fe27b9a090d3b3f57bc1cd3bf1a");
            } else {
                d();
            }
        }

        @Override // com.sankuai.waimai.ugc.creator.utils.task.a
        public void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c11151d7f195caeb3cd431e2c5908a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c11151d7f195caeb3cd431e2c5908a");
                return;
            }
            d();
            super.cancel();
        }

        private void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87dc9f7cc84337ff2e55376de57d6a51", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87dc9f7cc84337ff2e55376de57d6a51");
            } else if (this.d != null) {
                if (!this.d.isClosed()) {
                    this.d.close();
                }
                this.d = null;
            }
        }
    }

    @Nullable
    public static Cursor a(Context context, Uri uri) {
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3c96c62cdc36113f84f8ee72843b1af", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cursor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3c96c62cdc36113f84f8ee72843b1af");
        }
        String[] strArr = {"_id", "_data", "_size", "width", "height", "mime_type", "date_added", "bucket_id", "bucket_display_name"};
        t createContentResolver = Privacy.createContentResolver(context, i.a().c().v);
        if (createContentResolver != null) {
            return createContentResolver.a(uri, strArr, "mime_type=='image/jpeg' OR mime_type=='image/png'", null, "date_added DESC ");
        }
        return null;
    }

    public static List<ImageData> a(Cursor cursor, boolean z) {
        Object[] objArr = {cursor, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf1a9f82399781790c2a3382a8385f11", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf1a9f82399781790c2a3382a8385f11");
        }
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("_data"));
                ImageData imageData = new ImageData(string, string, cursor.getInt(cursor.getColumnIndex("_size")), cursor.getInt(cursor.getColumnIndex("width")), cursor.getInt(cursor.getColumnIndex("height")), cursor.getString(cursor.getColumnIndex("bucket_id")), cursor.getString(cursor.getColumnIndex("bucket_display_name")), cursor.getLong(cursor.getColumnIndex("date_added")));
                imageData.r = f.a(imageData.h);
                arrayList.add(imageData);
                if (z) {
                    break;
                }
            }
        }
        return arrayList;
    }
}
