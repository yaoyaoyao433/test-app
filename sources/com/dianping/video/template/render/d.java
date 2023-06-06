package com.dianping.video.template.render;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.video.videofilter.gpuimage.e;
import com.dianping.video.videofilter.gpuimage.f;
import com.dianping.video.videofilter.gpuimage.h;
import com.dianping.video.videofilter.gpuimage.i;
import com.dianping.video.videofilter.gpuimage.m;
import com.dianping.video.videofilter.gpuimage.u;
import com.dianping.video.videofilter.gpuimage.v;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d {
    public static ChangeQuickRedirect a = null;
    private static final String e = "d";
    public com.dianping.video.template.render.model.c b;
    public com.dianping.video.videofilter.template.b c;
    public com.dianping.video.template.model.material.extra.c d;
    private h f;
    private FloatBuffer g;
    private FloatBuffer h;
    private int i;
    private int j;
    private List<com.dianping.video.template.model.b> k;
    private HashMap<Integer, f> l;
    private m m;
    private HashMap<com.dianping.video.videofilter.template.b, ArrayList<JsonObject>> n;
    private HashMap<com.dianping.video.videofilter.template.b, ArrayList<JsonObject>> o;
    private List<String> p;
    private List<String> q;

    public d(com.dianping.video.template.render.model.c cVar, int i, int i2) {
        Object[] objArr = {cVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1d0a18450ce5bb4a910bc715ee0910f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1d0a18450ce5bb4a910bc715ee0910f");
            return;
        }
        this.l = new HashMap<>();
        this.n = new HashMap<>();
        this.o = new HashMap<>();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.b = cVar;
        this.i = i;
        this.j = i2;
        c();
    }

    private long b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51f7749a440a5355e3e40ce5626239ab", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51f7749a440a5355e3e40ce5626239ab")).longValue() : this.b.l.c;
    }

    private void c() {
        int i;
        int i2;
        String str;
        String str2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68f9cce7f4d7d30eddfaf36523681feb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68f9cce7f4d7d30eddfaf36523681feb");
            return;
        }
        float[] a2 = v.a(u.a(this.b.f), false, false);
        this.h = ByteBuffer.allocateDirect(v.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.h.put(a2).position(0);
        this.g = ByteBuffer.allocateDirect(com.dianping.video.template.utils.b.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.g.put(com.dianping.video.template.utils.b.a).position(0);
        this.m = new m();
        m mVar = this.m;
        int i3 = this.b.n;
        Object[] objArr2 = {Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = m.a;
        if (PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "4a459f659cebbb343711fdd6d3279f8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "4a459f659cebbb343711fdd6d3279f8e");
        } else if (i3 == 1) {
            mVar.a("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision highp float;\n\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform vec2 texSize;\nuniform vec2 fboSize;\nuniform vec2 canvasScale;\n\nconst vec4 black = vec4(0.0, 0.0, 0.0, 1.0);\nconst vec2 boundMin = vec2(0.0, 0.0);\nconst vec2 boundMax = vec2(1.0, 1.0);\n\nbool inBounds(vec2 p) {\n return all(lessThan(boundMin, p)) && all(lessThan(p, boundMax));\n}\n\nvec2 getTexCoord(){\n    if (texSize.x * fboSize.y > texSize.y * fboSize.x) {\n       float width = texSize.x * (fboSize.y / texSize.y);\n       float scale = fboSize.x / width;\n       float xoffset = (1. - scale) / 2.;\n       vec2 texCoord = textureCoordinate * vec2(scale, 1.) + vec2(xoffset , 0.);\n       return vec2((texCoord.x - 0.5) * canvasScale.x + 0.5, (texCoord.y - 0.5) * canvasScale.y + 0.5);\n    } else {\n       float height = texSize.y * (fboSize.x / texSize.x);\n       float scale = fboSize.y / height;\n       float yoffset = (1. - scale) / 2.;\n       vec2 texCoord = textureCoordinate * vec2(1., scale) + vec2(0. , yoffset);\n       return vec2((texCoord.x - 0.5) * canvasScale.x + 0.5, (texCoord.y - 0.5) * canvasScale.y + 0.5);\n    }\n}\n\nvoid main() {\n    vec2 texCoord = getTexCoord();\n    if (inBounds(texCoord)) {\n        gl_FragColor = texture2D(inputImageTexture, texCoord);\n    } else {\n        gl_FragColor = black;\n    }\n}");
        } else if (i3 == 2) {
            mVar.a("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision mediump float;\n\nvarying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform vec2 texSize;\nuniform vec2 fboSize;\nuniform vec2 canvasScale;\n\nconst vec4 black = vec4(0.0, 0.0, 0.0, 1.0);\nconst vec2 boundMin = vec2(0.0, 0.0);\nconst vec2 boundMax = vec2(1.0, 1.0);\n\nbool inBounds(vec2 p) {\n return all(lessThan(boundMin, p)) && all(lessThan(p, boundMax));\n}\n\nvec2 getTexCoord(){\n    if (texSize.x * fboSize.y > texSize.y * fboSize.x) {\n       float height = texSize.y * (fboSize.x / texSize.x);\n       float scale = fboSize.y / height;\n       float yoffset = (scale - 1.) / 2.;\n       vec2 texCoord = textureCoordinate * vec2(1., scale) - vec2(0. , yoffset);\n       return vec2((texCoord.x - 0.5) * canvasScale.x + 0.5, (texCoord.y - 0.5) * canvasScale.y + 0.5);\n    } else {\n       float width = texSize.x * (fboSize.y / texSize.y);\n       float scale = fboSize.x / width;\n       float xoffset = (scale - 1.) / 2.;\n       vec2 texCoord = textureCoordinate * vec2(scale, 1.) - vec2(xoffset , 0.);\n       return vec2((texCoord.x - 0.5) * canvasScale.x + 0.5, (texCoord.y - 0.5) * canvasScale.y + 0.5);\n    }\n}\n\nvoid main() {\n    vec2 texCoord = getTexCoord();\n   \n    if (inBounds(texCoord)) {\n        gl_FragColor = texture2D(inputImageTexture, texCoord);\n    } else {\n        gl_FragColor = black;\n    }\n}");
        }
        if (this.b.l.h <= 0) {
            i = this.i;
        } else {
            i = this.b.l.h;
        }
        if (this.b.l.i <= 0) {
            i2 = this.j;
        } else {
            i2 = this.b.l.i;
        }
        m mVar2 = this.m;
        float f = i;
        float f2 = i2;
        Object[] objArr3 = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect3 = m.a;
        if (PatchProxy.isSupport(objArr3, mVar2, changeQuickRedirect3, false, "5e91f39d672d5725121c1590a7269ee8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, mVar2, changeQuickRedirect3, false, "5e91f39d672d5725121c1590a7269ee8");
        } else {
            mVar2.c = new float[]{f, f2};
        }
        m mVar3 = this.m;
        float f3 = this.i / f;
        float f4 = this.j / f2;
        Object[] objArr4 = {Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect4 = m.a;
        if (PatchProxy.isSupport(objArr4, mVar3, changeQuickRedirect4, false, "384e6babc4699acc9fc8902ac30d4ed2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, mVar3, changeQuickRedirect4, false, "384e6babc4699acc9fc8902ac30d4ed2");
        } else {
            mVar3.q = new float[]{f3, f4};
        }
        if (this.b.f == 90 || this.b.f == 270) {
            this.m.a(this.b.e, this.b.d);
        } else {
            this.m.a(this.b.d, this.b.e);
        }
        com.dianping.codelog.b.a(d.class, "initFilter", "mScaleFilter info : setFrameSize = " + i + " - " + i2 + " setScale = " + this.m.q[0] + " - " + this.m.q[1] + " : setTextureSize = " + this.m.b[0] + CommonConstant.Symbol.MINUS + this.m.b[1]);
        this.k = this.b.l.f;
        if (this.k != null) {
            for (int i4 = 0; i4 < this.k.size(); i4++) {
                com.dianping.video.template.model.b bVar = this.k.get(i4);
                boolean z = bVar instanceof com.dianping.video.template.model.material.extra.a;
                if (z || (bVar instanceof com.dianping.video.template.model.material.extra.c)) {
                    if (z) {
                        com.dianping.video.template.model.material.extra.a aVar = (com.dianping.video.template.model.material.extra.a) bVar;
                        str = aVar.e;
                        str2 = aVar.f;
                    } else {
                        com.dianping.video.template.model.material.extra.c cVar = (com.dianping.video.template.model.material.extra.c) bVar;
                        str = cVar.e;
                        str2 = cVar.f;
                    }
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                        if (TextUtils.isEmpty(str)) {
                            Log.e(e, "index " + i4 + " vertexPath is empty");
                            com.dianping.codelog.b.b(d.class, "initFilter", "init Filter error : index " + i4 + " vertexPath is empty");
                        }
                        if (TextUtils.isEmpty(str2)) {
                            Log.e(e, "index " + i4 + " fragmentPath is empty");
                            com.dianping.codelog.b.b(d.class, "initFilter", "init Filter error : index " + i4 + " fragmentPath is empty");
                        }
                    } else {
                        List<String> a3 = com.dianping.video.template.utils.c.a(str, str2, bVar.c);
                        if (a3.size() != 2) {
                            Log.e(e, "index " + i4 + " get shade failed");
                            com.dianping.codelog.b.b(d.class, "initFilter", "init Filter error : index " + i4 + " get shade failed");
                        } else {
                            com.dianping.video.videofilter.template.b bVar2 = new com.dianping.video.videofilter.template.b(a3.get(0), a3.get(1));
                            if (z) {
                                ArrayList<JsonObject> arrayList = new ArrayList<>();
                                ArrayList<JsonObject> arrayList2 = new ArrayList<>();
                                this.l.put(Integer.valueOf(i4), bVar2);
                                com.dianping.video.template.model.material.extra.a aVar2 = (com.dianping.video.template.model.material.extra.a) bVar;
                                com.dianping.video.template.utils.c.a(arrayList2, arrayList, aVar2.g, aVar2.h);
                                this.o.put(bVar2, arrayList2);
                                this.n.put(bVar2, arrayList);
                            } else {
                                this.c = bVar2;
                                this.d = (com.dianping.video.template.model.material.extra.c) bVar;
                            }
                        }
                    }
                } else if (bVar instanceof com.dianping.video.template.model.material.extra.b) {
                    try {
                        Bitmap a4 = com.sankuai.waimai.launcher.util.image.a.a(((com.dianping.video.template.model.material.extra.b) bVar).f);
                        i iVar = new i();
                        iVar.a(a4);
                        iVar.a(((com.dianping.video.template.model.material.extra.b) bVar).e);
                        this.l.put(Integer.valueOf(i4), iVar);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    private void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fd7bfcd2a900b00c11be4bd2551c100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fd7bfcd2a900b00c11be4bd2551c100");
            return;
        }
        if (this.f != null) {
            this.f.d();
        }
        this.f = new h();
        if (!this.b.m) {
            this.f.a(new e());
        }
        if (this.m != null) {
            this.f.a(this.m);
        }
        this.k = this.b.l.f;
        long b = j - (b() * 1000);
        this.p.clear();
        for (int i = 0; i < this.k.size(); i++) {
            com.dianping.video.template.model.b bVar = this.k.get(i);
            if (!(bVar instanceof com.dianping.video.template.model.material.extra.c) && b >= bVar.b * 1000 && b < (bVar.b * 1000) + (bVar.a * 1000)) {
                f fVar = this.l.get(Integer.valueOf(i));
                if (fVar instanceof com.dianping.video.videofilter.template.b) {
                    ArrayList<JsonObject> arrayList = this.o.get(fVar);
                    if (arrayList != null) {
                        com.dianping.video.template.utils.c.a((com.dianping.video.videofilter.template.b) fVar, arrayList);
                    }
                    float f = (((float) (b - (bVar.b * 1000))) * 1.0f) / (bVar.a * 1000);
                    com.dianping.codelog.b.a(d.class, "updateProgress", "material time = " + bVar.b + " - " + bVar.a + " now progress =  " + f);
                    ArrayList<JsonObject> arrayList2 = this.n.get(fVar);
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            com.dianping.video.template.utils.c.a((com.dianping.video.videofilter.template.b) fVar, arrayList2.get(i2), f);
                        }
                    }
                }
                this.f.a(fVar);
                this.p.add(bVar.a());
            }
        }
    }

    private void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ec2cfa0b93e3887a0637ac38c99cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ec2cfa0b93e3887a0637ac38c99cc4");
            return;
        }
        long b = j - (b() * 1000);
        for (f fVar : this.f.i()) {
            Iterator<Integer> it = this.l.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (fVar.equals(this.l.get(Integer.valueOf(intValue))) && (fVar instanceof com.dianping.video.videofilter.template.b)) {
                        com.dianping.video.template.model.b bVar = this.k.get(intValue);
                        float f = (((float) (b - (bVar.b * 1000))) * 1.0f) / (bVar.a * 1000);
                        ((com.dianping.video.videofilter.template.b) fVar).a(NotificationCompat.CATEGORY_PROGRESS, f);
                        com.dianping.codelog.b.a(d.class, "updateProgress", "material time = " + bVar.b + " - " + bVar.a + " now progress =  " + f);
                        break;
                    }
                }
            }
        }
    }

    private boolean d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d772b24eff1e0d630c12e29ce634b381", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d772b24eff1e0d630c12e29ce634b381")).booleanValue();
        }
        if (this.f == null || this.p.size() == 0) {
            return true;
        }
        this.q.clear();
        this.q.addAll(this.p);
        long b = j - (b() * 1000);
        for (int i = 0; i < this.k.size(); i++) {
            com.dianping.video.template.model.b bVar = this.k.get(i);
            if (!(bVar instanceof com.dianping.video.template.model.material.extra.c) && b >= bVar.b * 1000 && b < (bVar.b * 1000) + (bVar.a * 1000)) {
                String a2 = bVar.a();
                if (!this.q.contains(a2)) {
                    return true;
                }
                this.q.remove(a2);
            }
        }
        return this.q.size() != 0;
    }

    public final int a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d884717d773a15ea0f61d4ebe251fbfb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d884717d773a15ea0f61d4ebe251fbfb")).intValue();
        }
        if (d(j)) {
            com.dianping.codelog.b.a(d.class, "render", "needUpdate Filter : now pts =  " + j);
            b(j);
            d();
        } else {
            com.dianping.codelog.b.a(d.class, "render", "only updateProgress : now pts =  " + j);
            c(j);
        }
        this.f.a(this.b.d(), this.g, this.h);
        return this.f.c[0];
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f98dbda02dec2916f2ae16be37ea8b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f98dbda02dec2916f2ae16be37ea8b1");
            return;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glDisable(2929);
        this.f.b();
        GLES20.glUseProgram(this.f.h());
        this.f.a(this.i, this.j);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbd27a1866fb07d81361e07af4118b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbd27a1866fb07d81361e07af4118b55");
        } else if (this.f != null) {
            this.f.d();
            this.f = null;
        }
    }
}
