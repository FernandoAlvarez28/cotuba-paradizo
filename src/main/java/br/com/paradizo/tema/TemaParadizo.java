package br.com.paradizo.tema;

import cotuba.core.plugin.tema.Tema;

public class TemaParadizo implements Tema {

	@Override
	public String getCss() {
		return FileUtils.getResourceContents("/tema.css");
	}

}