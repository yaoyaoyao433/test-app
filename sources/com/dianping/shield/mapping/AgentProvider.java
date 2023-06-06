package com.dianping.shield.mapping;

import com.dianping.eunomia.c;
import com.dianping.eunomia.d;
import com.dianping.eunomia.g;
import com.dianping.shield.AgentRegisterKey;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AgentProvider {
    public static final String MRN_AGENT_PATH = "com.dianping.gcmrnmodule.MRNAgent";
    public static final String MRN_CONTAINER_AGENT_PATH = "com.dianping.gcmrnmodule.agent.MRNContainerAgent";
    private static final String MRN_CONTAINER_PREFIX = "mrncontainer_";
    private static final String MRN_PREFIX = "mrn_";
    public static final String MRN_SCROLL_TAB_AGENT_PATH = "com.dianping.gcmrnmodule.agent.MRNScrollTabAgent";
    private static final String MRN_SCROLL_TAB_PREFIX = "mrnscrolltab_";
    public static final String MRN_TAB_AGENT_PATH = "com.dianping.gcmrnmodule.agent.MRNTabAgent";
    private static final String MRN_TAB_PREFIX = "mrntab_";
    private static final String PICASSOVC_PREFIX = "picassovc_";
    public static final String PICASSO_AGENT_PATH = "com.dianping.picassomodule.PicassoAgent";
    public static final int PICASSO_AGENT_TYPE = 1;
    public static final String PICASSO_CONTAINER_AGENT_PATH = "com.dianping.picassomodule.PicassoContainerAgent";
    public static final int PICASSO_CONTAINER_AGENT_TYPE = 4;
    private static final String PICASSO_CONTAINER_PREFIX = "picassocontainer_";
    public static final int PICASSO_MRN_TYPE = 7;
    private static final String PICASSO_PREFIX = "picasso_";
    public static final String PICASSO_SCROLL_TAB_AGENT_PATH = "com.dianping.picassomodule.PicassoScrollTabAgent";
    public static final int PICASSO_SCROLL_TAB_AGENT_TYPE = 5;
    private static final String PICASSO_SCROLL_TAB_PREFIX = "picassoscrolltab_";
    public static final String PICASSO_TAB_AGENT_PATH = "com.dianping.picassomodule.PicassoTabAgent";
    public static final int PICASSO_TAB_AGENT_TYPE = 2;
    private static final String PICASSO_TAB_PREFIX = "picassotab_";
    public static final String PICASSO_VC_AGENT_PATH = "com.dianping.picassovcmodule.PicassoVCAgent";
    public static final int PICASSO_VC_AGENT_TYPE = 6;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Class mrnClass;
    public static Class mrnContainerClass;
    public static Class mrnScrollTabClass;
    public static Class mrnTabClass;
    public static Class picassoClass;
    public static Class picassoContainerClass;
    public static Class picassoScrollTabClass;
    public static Class picassoTabClass;
    public static Class picassoVCClass;

    public static void prelaodMRNClass() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae878d378728b80a4a0ddc4605ee251a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae878d378728b80a4a0ddc4605ee251a");
            return;
        }
        if (mrnClass == null) {
            try {
                mrnClass = Class.forName(MRN_AGENT_PATH);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (mrnTabClass == null) {
            try {
                mrnTabClass = Class.forName(MRN_TAB_AGENT_PATH);
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            }
        }
        if (mrnScrollTabClass == null) {
            try {
                mrnScrollTabClass = Class.forName(MRN_SCROLL_TAB_AGENT_PATH);
            } catch (ClassNotFoundException e3) {
                e3.printStackTrace();
            }
        }
        if (mrnContainerClass == null) {
            try {
                mrnContainerClass = Class.forName(MRN_CONTAINER_AGENT_PATH);
            } catch (ClassNotFoundException e4) {
                e4.printStackTrace();
            }
        }
    }

    public static ShieldConfigInfo getPicassoAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c7152e8a3ba57edcc7a2cc3577ae569", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c7152e8a3ba57edcc7a2cc3577ae569");
        }
        if (picassoClass == null) {
            try {
                picassoClass = Class.forName("com.dianping.picassomodule.PicassoAgent");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ShieldConfigInfo(str, picassoClass);
    }

    public static ShieldConfigInfo getMrnAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "141823d48664af147ad2b792b44301ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "141823d48664af147ad2b792b44301ae");
        }
        if (mrnClass == null) {
            try {
                mrnClass = Class.forName(MRN_AGENT_PATH);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ShieldConfigInfo(str, mrnClass);
    }

    public static ShieldConfigInfo getMRNTabAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c1c07414a7d6ed0c2aac8aacef670a65", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c1c07414a7d6ed0c2aac8aacef670a65");
        }
        if (mrnTabClass == null) {
            try {
                mrnTabClass = Class.forName(MRN_TAB_AGENT_PATH);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ShieldConfigInfo(str, mrnTabClass);
    }

    public static ShieldConfigInfo getMRNScrollTabAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "51e794810319d75303b4785fade16b81", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "51e794810319d75303b4785fade16b81");
        }
        if (mrnScrollTabClass == null) {
            try {
                mrnScrollTabClass = Class.forName(MRN_SCROLL_TAB_AGENT_PATH);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ShieldConfigInfo(str, mrnScrollTabClass);
    }

    public static ShieldConfigInfo getMRNContainerAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "65fcba24aa8550e7ab976c030c9219c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "65fcba24aa8550e7ab976c030c9219c7");
        }
        if (mrnContainerClass == null) {
            try {
                mrnContainerClass = Class.forName(MRN_CONTAINER_AGENT_PATH);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ShieldConfigInfo(str, mrnContainerClass);
    }

    public static ShieldConfigInfo getPicassoVCAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b405431b43ceb7b7f0082b031f45245e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b405431b43ceb7b7f0082b031f45245e");
        }
        if (picassoVCClass == null) {
            try {
                picassoVCClass = Class.forName(PICASSO_VC_AGENT_PATH);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ShieldConfigInfo(str, picassoVCClass);
    }

    public static ShieldConfigInfo getPicassoTabAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "739890caa7b6b8e766e9b04c103d3718", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "739890caa7b6b8e766e9b04c103d3718");
        }
        if (picassoTabClass == null) {
            try {
                picassoTabClass = Class.forName(PICASSO_TAB_AGENT_PATH);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ShieldConfigInfo(str, picassoTabClass);
    }

    public static ShieldConfigInfo getPicassoContainerAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aeeea346aae02da6379029c8bc71d574", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aeeea346aae02da6379029c8bc71d574");
        }
        if (picassoContainerClass == null) {
            try {
                picassoContainerClass = Class.forName(PICASSO_CONTAINER_AGENT_PATH);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ShieldConfigInfo(str, picassoContainerClass);
    }

    public static ShieldConfigInfo getPicassoScrollTabAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee4a566c44bf9f592c401054cacb410d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee4a566c44bf9f592c401054cacb410d");
        }
        if (picassoScrollTabClass == null) {
            try {
                picassoScrollTabClass = Class.forName(PICASSO_SCROLL_TAB_AGENT_PATH);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return new ShieldConfigInfo(str, picassoScrollTabClass);
    }

    public static ShieldConfigInfo mappingDynamicAgent(AgentRegisterKey agentRegisterKey, c cVar) {
        Object[] objArr = {agentRegisterKey, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf901d1b459106f5858595c5ec737a6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf901d1b459106f5858595c5ec737a6f");
        }
        if (agentRegisterKey == null) {
            return null;
        }
        return mappingDynamicAgent(agentRegisterKey, cVar != null ? cVar.c : 0);
    }

    public static ShieldConfigInfo mappingDynamicAgent(AgentRegisterKey agentRegisterKey) {
        Object[] objArr = {agentRegisterKey};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        d dVar = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "63c68d3e5c3413d9ec11cfe2b91c190b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "63c68d3e5c3413d9ec11cfe2b91c190b");
        }
        if (agentRegisterKey == null) {
            return null;
        }
        if (agentRegisterKey.key != null) {
            g a = g.a();
            String str = agentRegisterKey.key;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = g.a;
            dVar = PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "b1ab5401ccb56ec4c952b136e5aedd39", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "b1ab5401ccb56ec4c952b136e5aedd39") : a.b.get(str);
        }
        return mappingDynamicAgent(agentRegisterKey, dVar != null ? dVar.c : 0);
    }

    private static ShieldConfigInfo mappingDynamicAgent(AgentRegisterKey agentRegisterKey, int i) {
        Object[] objArr = {agentRegisterKey, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "06a6792bef2c9f6a63f78bd35d029c08", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "06a6792bef2c9f6a63f78bd35d029c08");
        }
        if (agentRegisterKey.key != null) {
            String[] split = agentRegisterKey.key.split("/");
            if (split != null && split.length > 0) {
                String str = split[split.length - 1];
                if (str != null && str.startsWith(PICASSO_PREFIX)) {
                    return getPicassoAgent(agentRegisterKey.key);
                }
                if (str != null && str.startsWith(MRN_PREFIX)) {
                    return getMrnAgent(agentRegisterKey.key);
                }
                if (str != null && str.startsWith(MRN_TAB_PREFIX)) {
                    return getMRNTabAgent(agentRegisterKey.key);
                }
                if (str != null && str.startsWith("mrnscrolltab_")) {
                    return getMRNScrollTabAgent(agentRegisterKey.key);
                }
                if (str != null && str.startsWith(MRN_CONTAINER_PREFIX)) {
                    return getMRNContainerAgent(agentRegisterKey.key);
                }
                if (str != null && str.startsWith(PICASSO_TAB_PREFIX)) {
                    return getPicassoTabAgent(agentRegisterKey.key);
                }
                if (str != null && str.startsWith(PICASSO_CONTAINER_PREFIX)) {
                    return getPicassoContainerAgent(agentRegisterKey.key);
                }
                if (str != null && str.startsWith(PICASSO_SCROLL_TAB_PREFIX)) {
                    return getPicassoScrollTabAgent(agentRegisterKey.key);
                }
                if (str != null && str.startsWith(PICASSOVC_PREFIX)) {
                    return getPicassoVCAgent(agentRegisterKey.key);
                }
            }
            if (i != 0) {
                if (i == 1) {
                    return getPicassoAgent(agentRegisterKey.key);
                }
                if (i == 7) {
                    return getMrnAgent(agentRegisterKey.key);
                }
                if (i == 2) {
                    return getPicassoTabAgent(agentRegisterKey.key);
                }
                if (i == 4) {
                    return getPicassoContainerAgent(agentRegisterKey.key);
                }
                if (i == 5) {
                    return getPicassoScrollTabAgent(agentRegisterKey.key);
                }
                if (i == 6) {
                    return getPicassoVCAgent(agentRegisterKey.key);
                }
            }
        }
        return null;
    }
}
