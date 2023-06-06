package com.meituan.android.mtplayer.video;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.mtplayer.video.proxy.d;
import com.meituan.android.mtplayer.video.proxy.m;
import com.meituan.android.mtplayer.video.proxy.q;
import com.meituan.android.mtplayer.video.proxy.r;
import com.meituan.mtwebkit.MTURLUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BasePlayerParam implements Parcelable {
    public static ChangeQuickRedirect b;
    private Uri a;
    protected final int c;
    protected final int d;
    protected boolean e;
    private Map<String, String> f;
    private String g;
    private String h;
    private volatile com.meituan.android.mtplayer.video.proxy.k i;
    private r j;
    private String k;
    private com.meituan.android.mtplayer.video.proxy.d l;
    private com.meituan.android.mtplayer.video.proxy.c m;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BasePlayerParam(Uri uri) {
        this(uri, null);
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c525f34552809d13c200a7be0eed9363", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c525f34552809d13c200a7be0eed9363");
        }
    }

    private BasePlayerParam(Uri uri, @Nullable Map<String, String> map) {
        Object[] objArr = {uri, null};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd00a5edca45c43f57842f46e83622c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd00a5edca45c43f57842f46e83622c6");
            return;
        }
        this.k = "default";
        if (uri == null) {
            this.c = 0;
            this.d = 3;
            return;
        }
        this.a = uri;
        this.f = null;
        this.c = 1;
        this.d = a(this.c, uri.getScheme());
    }

    public BasePlayerParam(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc4c425c9c752973e6d1a18aec80f5b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc4c425c9c752973e6d1a18aec80f5b3");
            return;
        }
        this.k = "default";
        if (TextUtils.isEmpty(str)) {
            this.c = 0;
            this.d = 3;
        } else if (str.startsWith(MTURLUtil.ASSET_BASE)) {
            this.h = str.substring(22);
            if (TextUtils.isEmpty(this.h)) {
                this.c = 0;
                this.d = 3;
                return;
            }
            this.c = 5;
            this.d = 1;
        } else {
            this.g = str;
            this.c = 3;
            this.d = a(this.c, str);
        }
    }

    public BasePlayerParam(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd3bafba735f43e3bd100c8d3e3dc66c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd3bafba735f43e3bd100c8d3e3dc66c");
            return;
        }
        this.k = "default";
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.k = parcel.readString();
        this.e = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e6507a22c173ff184490ad8fff4e8d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e6507a22c173ff184490ad8fff4e8d1");
            return;
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.k);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    private int a(int i, @Nullable String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dc92df71a4787549bde4180fff65201", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dc92df71a4787549bde4180fff65201")).intValue();
        }
        if (i == 4) {
            return 2;
        }
        return (TextUtils.isEmpty(str) || !(str.startsWith("http") || str.startsWith("https"))) ? 1 : 0;
    }

    private String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfd13f1f1142cf67724a344a2e20aaea", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfd13f1f1142cf67724a344a2e20aaea");
        }
        String b2 = b();
        return (this.d == 0 && this.e) ? (b2 == null || !b2.contains(".m3u8")) ? b(i).a(this.k) : b2 : b2;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "753ccb9e62f315bbb78d7ef0b8221722", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "753ccb9e62f315bbb78d7ef0b8221722");
        }
        int i = this.c;
        if (i != 1) {
            return i != 3 ? "" : this.g;
        }
        return this.a.toString();
    }

    @Nullable
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1486d7bb546f272d944b9f9fb08b1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1486d7bb546f272d944b9f9fb08b1d");
        }
        int i = this.c;
        if (i == 1 || i == 3) {
            return b();
        }
        return i != 5 ? "" : this.h;
    }

    private synchronized com.meituan.android.mtplayer.video.proxy.k b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce4e19bbaf7fd2e24581ffa6024f8588", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.mtplayer.video.proxy.k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce4e19bbaf7fd2e24581ffa6024f8588");
        }
        if (this.i == null) {
            if (this.d == 2) {
                com.meituan.android.mtplayer.video.proxy.l a = com.meituan.android.mtplayer.video.proxy.l.a();
                this.i = a.a("source://" + this.j.toString() + this.j.hashCode(), this.j);
            } else {
                this.i = com.meituan.android.mtplayer.video.proxy.l.a().a(b(), this.l, this.m, this.k, i);
            }
        } else if (i != -1 && this.d == 0) {
            com.meituan.android.mtplayer.video.proxy.l.a().b(b(), i);
        }
        return this.i;
    }

    public final long d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b62fb5e17d644d28f7d004bda66e8e2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b62fb5e17d644d28f7d004bda66e8e2")).longValue();
        }
        if (this.d == 0) {
            try {
                return q.a(this.l, b(), this.k);
            } catch (Exception e) {
                com.meituan.android.mtplayer.video.utils.c.a("PreDownload", "getCacheSize error", e);
                return -1L;
            }
        }
        return -1L;
    }

    public void a(Context context, @Nullable String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5b13199b059fb6ab28169bfb3503fd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5b13199b059fb6ab28169bfb3503fd5");
        } else {
            a(str, new d.a(context).a());
        }
    }

    public void a(@Nullable String str, @NonNull com.meituan.android.mtplayer.video.proxy.d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0069ba95d27649403ca36845e0b45c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0069ba95d27649403ca36845e0b45c");
        } else if (this.d == 0) {
            this.e = true;
            this.k = str;
            this.l = dVar;
        }
    }

    public final void a(com.meituan.android.mtplayer.video.proxy.c cVar) {
        if (this.d == 0) {
            this.m = cVar;
        }
    }

    public final void a(m.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3228900535f8cc5ea5f4c077f8e76d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3228900535f8cc5ea5f4c077f8e76d37");
        } else {
            a(bVar, 100);
        }
    }

    public final void a(@Nullable m.b bVar, @IntRange(from = 0, to = 100) int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d2a1af04b172fdaeb8afa07bff856e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d2a1af04b172fdaeb8afa07bff856e");
        } else {
            a(bVar, m.d.a(i));
        }
    }

    public final void a(@Nullable m.b bVar, @NonNull m.d dVar) {
        Object[] objArr = {bVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2328074f555420afd8528adb60cf1db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2328074f555420afd8528adb60cf1db");
        } else if (this.d != 0) {
        } else {
            m.a(b(-1), b(), a(-1), bVar, dVar);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7ac5adfdcf0532a03354caa40d6f4d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7ac5adfdcf0532a03354caa40d6f4d4");
        } else {
            m.a(b());
        }
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a32644f7635e7c1d626ffb29acc723", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a32644f7635e7c1d626ffb29acc723")).booleanValue();
        }
        String a = a(-1);
        return (a == null || a.startsWith("http") || a.startsWith("https")) ? false : true;
    }

    public final synchronized void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aa817e28087109f8e08ed22e0c9fb7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aa817e28087109f8e08ed22e0c9fb7b");
            return;
        }
        if (this.d == 0 && this.e) {
            this.i = null;
            e();
            com.meituan.android.mtplayer.video.proxy.l.a().a(b(), hashCode());
        }
    }

    public final boolean a(Context context, com.meituan.android.mtplayer.video.player.d dVar) throws IOException {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99a4451394401c511cda34742682192b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99a4451394401c511cda34742682192b")).booleanValue();
        }
        if (context != null && dVar != null) {
            int i = this.c;
            if (i == 1) {
                dVar.setDataSource(context, Uri.parse(a(hashCode())), this.f);
                return true;
            }
            switch (i) {
                case 3:
                    dVar.setDataSource(a(hashCode()));
                    return true;
                case 4:
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    dVar.setDataSource(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcf76834090bfdb799680d9262e27ae9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcf76834090bfdb799680d9262e27ae9") : b(-1).a((String) null));
                    return true;
                case 5:
                    try {
                        AssetFileDescriptor openFd = context.getAssets().openFd(this.h);
                        if (openFd != null) {
                            dVar.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                            return true;
                        }
                    } catch (IOException unused) {
                        break;
                    }
                    break;
                default:
                    com.meituan.android.mtplayer.video.sniffer.c.a("mtplayer_video_other", "bind_param_fail", "video url error");
                    break;
            }
        }
        return false;
    }
}
