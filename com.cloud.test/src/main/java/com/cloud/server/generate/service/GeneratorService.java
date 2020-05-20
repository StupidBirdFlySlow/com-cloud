package com.cloud.server.generate.service;

import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;

public interface GeneratorService {

	void generatorCode(GlobalConfig gc, DataSourceConfig dsc, StrategyConfig strategy, PackageConfig pc,
			InjectionConfig cfg, TemplateConfig tc);

	void generatorDefault();

}
