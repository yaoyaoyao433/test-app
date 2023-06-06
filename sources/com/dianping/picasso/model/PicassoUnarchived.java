package com.dianping.picasso.model;

import android.text.TextUtils;
import android.util.Log;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Decoding;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.dianping.picasso.PicassoViewWrapperUtil;
import com.dianping.picassocontroller.vc.b;
import com.dianping.picassocontroller.vc.c;
import com.dianping.picassocontroller.vc.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoUnarchived extends Unarchived {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PicassoUnarchived(byte[] bArr) {
        super(bArr);
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "264e22e72e905205e70b6345a28daeba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "264e22e72e905205e70b6345a28daeba");
            return;
        }
        this.byteBuffer = ByteBuffer.wrap(bArr);
        this.byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public int getPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cae844aebbae3439c44f918e33f4ee16", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cae844aebbae3439c44f918e33f4ee16")).intValue() : this.byteBuffer.position();
    }

    @Override // com.dianping.jscore.model.Unarchived
    public <T> T readObject(DecodingFactory<T> decodingFactory) throws ArchiveException {
        T t;
        int i;
        DecodingFactory<T> decodingFactory2 = decodingFactory;
        Object[] objArr = {decodingFactory2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "585eecab4cad45017524f7ed73f14ddc", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "585eecab4cad45017524f7ed73f14ddc");
        }
        byte b = this.byteBuffer.get();
        if (b == 78) {
            return decodingFactory.createInstance();
        }
        if (b == 79) {
            if (decodingFactory2 == PicassoModel.PICASSO_DECODER) {
                this.byteBuffer.mark();
                while (true) {
                    int readMemberHash16 = readMemberHash16();
                    if (readMemberHash16 <= 0) {
                        i = -1;
                        break;
                    } else if (36666 == readMemberHash16) {
                        i = (int) readDouble();
                        break;
                    } else {
                        skipAny();
                    }
                }
                this.byteBuffer.reset();
                if (i != -1) {
                    DecodingFactory<T> viewModelFactoryByType = PicassoViewWrapperUtil.viewModelFactoryByType(Integer.valueOf(i));
                    if (viewModelFactoryByType != null) {
                        decodingFactory2 = viewModelFactoryByType;
                    } else {
                        Log.e("PicassoUnarchived", "Cannot find ViewWrapper for type " + i);
                    }
                }
            }
            T createInstance = decodingFactory2.createInstance();
            if (createInstance == null) {
                throw new ArchiveException("unable to create instance");
            }
            if (createInstance instanceof Decoding) {
                ((Decoding) createInstance).decode(this);
                if (createInstance instanceof PicassoModel) {
                    PicassoModel picassoModel = (PicassoModel) createInstance;
                    b a = c.a(picassoModel.hostId);
                    if (a instanceof g) {
                        if (picassoModel.key >= 0) {
                            g gVar = (g) a;
                            int i2 = picassoModel.key;
                            Object[] objArr2 = {Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect3 = g.m;
                            if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect3, false, "43748da680cfa2b034b49dd6e7be51ce", RobustBitConfig.DEFAULT_VALUE)) {
                                t = (T) ((PicassoModel) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect3, false, "43748da680cfa2b034b49dd6e7be51ce"));
                            } else {
                                t = i2 == -1 ? null : (T) gVar.r.get(i2);
                            }
                            if (t != null) {
                                new StringBuilder("Get cache for ").append(picassoModel.key);
                                return t;
                            }
                            if (!picassoModel.hidden) {
                                picassoModel.switchModel();
                            }
                            new StringBuilder("Set cache for ").append(picassoModel.key);
                            Object[] objArr3 = {picassoModel};
                            ChangeQuickRedirect changeQuickRedirect4 = g.m;
                            if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect4, false, "468522741fdf1cbeea1f430e3bdb7b23", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect4, false, "468522741fdf1cbeea1f430e3bdb7b23");
                            } else if (picassoModel.key != -1) {
                                try {
                                    gVar.r.put(picassoModel.key, picassoModel);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    com.dianping.codelog.b.b(gVar.getClass(), e.getMessage());
                                }
                            }
                        }
                        g gVar2 = (g) a;
                        Object[] objArr4 = {picassoModel};
                        ChangeQuickRedirect changeQuickRedirect5 = g.m;
                        if (PatchProxy.isSupport(objArr4, gVar2, changeQuickRedirect5, false, "4404036dba08b9a343cf1e685523608c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, gVar2, changeQuickRedirect5, false, "4404036dba08b9a343cf1e685523608c");
                        } else if (picassoModel != null) {
                            gVar2.o.put(picassoModel.viewId, new WeakReference<>(picassoModel));
                            if (picassoModel.componentId > 0) {
                                PicassoModel a2 = gVar2.a(picassoModel.componentId);
                                if (a2 != null && !TextUtils.isEmpty(a2.parentId)) {
                                    picassoModel.parentId = a2.parentId;
                                }
                                gVar2.q.put(picassoModel.componentId, new WeakReference<>(picassoModel));
                            }
                        }
                    }
                }
                return createInstance;
            }
            throw new ArchiveException("unable to decode class: " + createInstance.getClass().getSimpleName());
        }
        throw new ArchiveException("unable to read object: " + this);
    }
}
