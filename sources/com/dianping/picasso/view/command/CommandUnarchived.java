package com.dianping.picasso.view.command;

import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.DecodingFactory;
import com.dianping.jscore.model.Unarchived;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CommandUnarchived extends Unarchived {
    public static ChangeQuickRedirect changeQuickRedirect;

    public CommandUnarchived(byte[] bArr) {
        super(bArr);
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e84a7c7583ebacd0e16e4345fe0951d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e84a7c7583ebacd0e16e4345fe0951d3");
        }
    }

    public BaseViewCommandModel[] readArray(DecodingFactory[] decodingFactoryArr) throws ArchiveException {
        Object[] objArr = {decodingFactoryArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c13dca11dd519d418b8421e48f19e0be", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseViewCommandModel[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c13dca11dd519d418b8421e48f19e0be");
        }
        byte b = this.byteBuffer.get();
        if (b == 78) {
            return null;
        }
        if (b == 65) {
            int i = this.byteBuffer.getInt();
            BaseViewCommandModel[] baseViewCommandModelArr = new BaseViewCommandModel[i];
            for (int i2 = 0; i2 < i; i2++) {
                if (decodingFactoryArr[i2] != null) {
                    baseViewCommandModelArr[i2] = (BaseViewCommandModel) readObject(decodingFactoryArr[i2]);
                }
            }
            return baseViewCommandModelArr;
        }
        throw new ArchiveException("unable to read array (object): " + this);
    }
}
