package com.chan9u.base_databinding.base

import android.database.DatabaseUtils
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/*------------------------------------------------------------------------------
 * NAME    : BaseActivity
 * DESC    :
 * AUTHOR  : chan9U
 *------------------------------------------------------------------------------
 *                            변         경         사         항
 *------------------------------------------------------------------------------
 *    DATE     AUTHOR                         DESCRIPTION
 * ----------  ------  ---------------------------------------------------------
 * 2021.01.11  chan9U  최초 프로그램 작성
 *------------------------------------------------------------------------------*/
abstract class BaseActivity<B: ViewDataBinding>: AppCompatActivity() {

    protected lateinit var binding: B

    abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutId)
    }
}