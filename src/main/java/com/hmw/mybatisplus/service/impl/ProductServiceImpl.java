package com.hmw.mybatisplus.service.impl;

import com.hmw.mybatisplus.entity.Product;
import com.hmw.mybatisplus.mapper.ProductMapper;
import com.hmw.mybatisplus.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hmw
 * @since 2020-12-26
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
