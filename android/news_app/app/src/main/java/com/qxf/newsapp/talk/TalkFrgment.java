package com.qxf.newsapp.talk;

import com.hyphenate.easeui.ui.EaseChatFragment;

/**
 * Created by Administrator on 2017/9/15.
 */

public class TalkFrgment extends EaseChatFragment {
    @Override
    protected void initView() {
        super.initView();
        hideTitleBar();
    }
}
