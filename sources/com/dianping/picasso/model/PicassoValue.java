package com.dianping.picasso.model;

import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoValue extends Value {
    public static ChangeQuickRedirect changeQuickRedirect;

    public PicassoValue(Value value) {
        Object[] objArr = {value};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce11a0aeb8b1c1ff1f60191c3177baea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce11a0aeb8b1c1ff1f60191c3177baea");
        } else if (value == null || value.getUnarchived() == null || value.getUnarchived().rawData() == null || value.getUnarchived().rawData().length == 0 || value.isNULL()) {
            this.unarchived = new PicassoUnarchived(new byte[]{78});
        } else {
            this.unarchived = new PicassoUnarchived(value.getUnarchived().rawData());
        }
    }

    public PicassoValue(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b612b09b4d50b8e7df8fb27c2e19a42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b612b09b4d50b8e7df8fb27c2e19a42");
        } else {
            this.unarchived = new PicassoUnarchived(bArr);
        }
    }

    @Override // com.dianping.jscore.Value
    public <T> T object(DecodingFactory<T> decodingFactory) throws ArchiveException {
        Object[] objArr = {decodingFactory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f8d28fe0ccf94cbb5d3a1fa316c03c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f8d28fe0ccf94cbb5d3a1fa316c03c5");
        }
        this.unarchived.rewind();
        return (T) this.unarchived.readObject(decodingFactory);
    }

    @Override // com.dianping.jscore.Value
    public <T> T[] array(DecodingFactory<T> decodingFactory) throws ArchiveException {
        Object[] objArr = {decodingFactory};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5cd10ec79493246e587ebeca3070565", RobustBitConfig.DEFAULT_VALUE)) {
            return (T[]) ((Object[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5cd10ec79493246e587ebeca3070565"));
        }
        this.unarchived.rewind();
        return (T[]) this.unarchived.readArray(decodingFactory);
    }

    @Override // com.dianping.jscore.Value
    public boolean isNULL() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "82cb099c0928ff05bd882c41d7a3de93", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "82cb099c0928ff05bd882c41d7a3de93")).booleanValue();
        }
        this.unarchived.rewind();
        return this.unarchived.peek() == 78;
    }
}
